package de.sda.nlp.analyze;

import static org.apache.uima.fit.factory.JCasFactory.createJCas;
import static org.apache.uima.fit.pipeline.SimplePipeline.runPipeline;

import java.io.IOException;

import org.apache.uima.UIMAException;
import org.apache.uima.analysis_engine.AnalysisEngine;
import org.apache.uima.fit.factory.AnalysisEngineFactory;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;

import de.tudarmstadt.ukp.dkpro.core.languagetool.LanguageToolLemmatizer;
import org.dkpro.core.matetools.MateMorphTagger;
import de.tudarmstadt.ukp.dkpro.core.opennlp.OpenNlpPosTagger;
import de.tudarmstadt.ukp.dkpro.core.opennlp.OpenNlpSegmenter;

public class LinguisticAnalyzer {

	private JCas jcas;
	
	// reusable analysis engines
	AnalysisEngine lemmatizer;
	AnalysisEngine morphTagger;
	AnalysisEngine posTagger;
	AnalysisEngine segmenter;
	
	public LinguisticAnalyzer() {
		try {
			this.jcas = createJCas();
			this.lemmatizer = AnalysisEngineFactory.createEngine(LanguageToolLemmatizer.class);
			this.morphTagger = AnalysisEngineFactory.createEngine(MateMorphTagger.class, MateMorphTagger.PARAM_LANGUAGE, "de");
			this.posTagger = AnalysisEngineFactory.createEngine(OpenNlpPosTagger.class);
			this.segmenter = AnalysisEngineFactory.createEngine(OpenNlpSegmenter.class);
			
		} catch (UIMAException e) {
			e.printStackTrace();
		}
	}
	
	public void analyze(String text, String language) throws ResourceInitializationException, UIMAException, IOException {
		jcas.reset();
		jcas.setDocumentText(text);
		jcas.setDocumentLanguage(language);
		
		runPipeline(jcas, segmenter, posTagger, lemmatizer, morphTagger);
	}
	
	public JCas getJCas() {
		return this.jcas;
	}
}
