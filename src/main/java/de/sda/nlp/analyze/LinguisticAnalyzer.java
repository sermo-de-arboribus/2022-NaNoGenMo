package de.sda.nlp.analyze;

import static org.apache.uima.fit.factory.JCasFactory.createJCas;
import static org.apache.uima.fit.pipeline.SimplePipeline.runPipeline;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.uima.UIMAException;
import org.apache.uima.analysis_component.AnalysisComponent;
import org.apache.uima.analysis_engine.AnalysisEngine;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.fit.factory.AnalysisEngineFactory;
import org.apache.uima.fit.util.JCasUtil;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;

import de.tudarmstadt.ukp.dkpro.core.api.lexmorph.type.morph.MorphologicalFeatures;
import de.tudarmstadt.ukp.dkpro.core.api.lexmorph.type.pos.POS;
import de.tudarmstadt.ukp.dkpro.core.api.ner.type.NamedEntity;
import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Token;
import org.dkpro.core.matetools.MateMorphTagger;

import de.tudarmstadt.ukp.dkpro.core.opennlp.OpenNlpNamedEntityRecognizer;
import de.tudarmstadt.ukp.dkpro.core.opennlp.OpenNlpPosTagger;
import de.tudarmstadt.ukp.dkpro.core.opennlp.OpenNlpSegmenter;

public class LinguisticAnalyzer {

	private JCas jcas;
	private String lemmatizerClassName;
	
	// reusable analysis engines
	private AnalysisEngine lemmatizer;
	private AnalysisEngine morphTagger;
	private AnalysisEngine posTagger;
	private AnalysisEngine segmenter;
	private AnalysisEngine personEntityRecognizer;
	private AnalysisEngine locationEntityRecognizer;
	private AnalysisEngine nemgpEntityRecognizer;
	
	public LinguisticAnalyzer(String lemmatizerClassName) throws ClassNotFoundException {
		this.lemmatizerClassName = lemmatizerClassName;
		initalizeAnalysisEngines(lemmatizerClassName);
	}
	
	public synchronized Collection<AnalyzedToken> analyze(String text, String language) throws ResourceInitializationException, UIMAException, IOException {
		
		jcas.reset();
		jcas.setDocumentText(text);
		jcas.setDocumentLanguage(language);
		runUIMAPipeline(language);
		
		Collection<AnalyzedToken> result = collectAnalyzedTokens(language);
		return result;
	}

	public String getLemmatizerClassName() {
		return lemmatizerClassName;
	}
	
	public void setLemmatizerClassName(String lemmatizerClassName) {
		this.lemmatizerClassName = lemmatizerClassName;
	}
	
	private void addNamedEntitiesInfo(AnalyzedToken at, Token token, Collection<NamedEntity> namedEntities) {
		int tokenBeginIndex = token.getBegin();
		int tokenEndIndex = token.getEnd();
		NamedEntity beginNE = namedEntities.stream().filter((ne) -> ne.getBegin() == tokenBeginIndex).findFirst().orElse(null);
		NamedEntity endNE = namedEntities.stream().filter((ne) -> ne.getEnd() == tokenEndIndex).findFirst().orElse(null);
		boolean isBeginningOfNE = beginNE != null;
		boolean isEndingOfNE = endNE != null;
		String namedEntityType = "";
		
		if(isBeginningOfNE) {
			namedEntityType = beginNE.getValue();
		} else if (isEndingOfNE) {
			namedEntityType = endNE.getValue();
		}
		
		if(namedEntityType.length() > 0) {
			at.setNamedEntity(new NamedEntityToken(namedEntityType, isBeginningOfNE, isEndingOfNE));			
		}
	}

	private Collection<AnalyzedToken> collectAnalyzedTokens(String language) {
		Collection<NamedEntity> namedEntities = JCasUtil.select(jcas, NamedEntity.class);
		Collection<AnalyzedToken> result = JCasUtil.select(jcas, Token.class)
				.stream()
				.map(token -> {
					AnalyzedToken at = dkproTokenToAnalyzedToken(token, language);
					addNamedEntitiesInfo(at, token, namedEntities);
					return at;
				})
				.collect(Collectors.toList());
		return result;
	}
	
	private AnalyzedToken dkproTokenToAnalyzedToken(Token token, String language) {
		AnalyzedToken at = new AnalyzedToken(token.getCoveredText(), language);
		at.setLemma(token.getLemmaValue());
		at.setPartOfSpeech(determinePartOfSpeech(token));
		
		// process morphological analysis
		MorphologicalFeatures morph = token.getMorph();
		String morphAnalysisResult = morph.getValue();
		Map<String, String> structuredFeatures = new HashMap<String, String>();
		
		if(morphAnalysisResult.equals("_") && at.getPartOfSpeech().equals("NNS")) {
			structuredFeatures.put("number", "pl");
		} else if (morphAnalysisResult.equals("_") && at.getPartOfSpeech().equals("DT")) {
			structuredFeatures.put("definiteness", determineDefiniteness(at, language));
		} else {
			String[] featureStrings = morphAnalysisResult.split("\\|");

			for(String feat : featureStrings) {
				String[] keyVal = feat.split("=");
				
				if(keyVal.length == 2) {
					structuredFeatures.put(keyVal[0], keyVal[1]);							
				}
			}
		}
		
		at.setMorphologicalFeatures(structuredFeatures);
		return at;
	}

	private String determineDefiniteness(AnalyzedToken at, String language) {
		
		switch(language) {
			case "de":
				if (at.getLemma().toLowerCase().startsWith("d")) {
					return "definite";
				} else {
					return "indefinite";
				}
			case "en":
			default:
				if (at.getLemma().toLowerCase().startsWith("t")) {
					return "definite";
				} else if (at.getLemma().toLowerCase().equals("a") || at.getLemma().toLowerCase().equals("an")) {
					return "indefinite";
				} else {
					return "_";
				}
		}
	}

	private String determinePartOfSpeech(Token token) {
		POS pos = token.getPos();
		String posValue = pos.getPosValue();
		String coarseValue = pos.getCoarseValue();
		
		switch(coarseValue) {
			case "PUNCT":
				return "PUNCT";
			default:
				return posValue;
		}
	}

	private void initalizeAnalysisEngines(String lemmatizerClassName) throws ClassNotFoundException {
		try {
			this.jcas = createJCas();
			this.lemmatizer = AnalysisEngineFactory.createEngine((Class<? extends AnalysisComponent>)Class.forName(lemmatizerClassName));
			this.morphTagger = AnalysisEngineFactory.createEngine(MateMorphTagger.class, MateMorphTagger.PARAM_LANGUAGE, "de");
			this.personEntityRecognizer = AnalysisEngineFactory.createEngine(OpenNlpNamedEntityRecognizer.class, OpenNlpNamedEntityRecognizer.PARAM_VARIANT, "person");
			this.locationEntityRecognizer = AnalysisEngineFactory.createEngine(OpenNlpNamedEntityRecognizer.class, OpenNlpNamedEntityRecognizer.PARAM_VARIANT, "location");
			this.nemgpEntityRecognizer = AnalysisEngineFactory.createEngine(OpenNlpNamedEntityRecognizer.class, OpenNlpNamedEntityRecognizer.PARAM_VARIANT, "nemgp");
			this.posTagger = AnalysisEngineFactory.createEngine(OpenNlpPosTagger.class);
			this.segmenter = AnalysisEngineFactory.createEngine(OpenNlpSegmenter.class);
			
		} catch (UIMAException e) {
			e.printStackTrace();
		}
	}
	
	private void runUIMAPipeline(String language) throws AnalysisEngineProcessException {
		if(language.equals("de")) {			
			runPipeline(jcas, segmenter, posTagger, lemmatizer, morphTagger, nemgpEntityRecognizer);
		} else {
			runPipeline(jcas, segmenter, posTagger, lemmatizer, morphTagger, personEntityRecognizer, locationEntityRecognizer);			
		}
	}
}
