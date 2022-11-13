package de.sda.quotes;

import java.io.IOException;
import java.util.Collection;
import java.util.Locale;
import java.util.stream.Collectors;

import org.apache.uima.UIMAException;
import org.apache.uima.fit.util.JCasUtil;
import org.apache.uima.jcas.JCas;

import de.sda.nlp.analyze.LinguisticAnalyzer;
import de.sda.quotes.model.Quote;
import de.sda.quotes.model.Version;
import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Token;

public class NlpAnnotatedQuote {
	
	private LinguisticAnalyzer analyzer = new LinguisticAnalyzer();
	private JCas jcas;
	private Locale language;
	private Version effectiveVersion;
	private String effectiveText;
	private int numberOfWords = Integer.MIN_VALUE;
	
	public NlpAnnotatedQuote(final Quote sourceQuote, final Locale language, final LinguisticAnalyzer analyzer) {

		this.analyzer = analyzer;
		this.language = language;
		this.effectiveVersion = sourceQuote.getVersions()
				.stream()
				.filter((vers) -> this.language.getLanguage().equals(vers.getLang().getLanguage()))
				.findFirst()
				.orElseThrow();
		this.effectiveText = this.effectiveVersion.getText().getContent().get(0).toString();
		
		runAnalysis();
	}
	
	public String getEffectiveText() {
		return this.effectiveText;
	}
	
	public int getNumberOfWords() {
		if(this.numberOfWords < 0) {
			Collection<Token> tokens = JCasUtil.select(this.jcas, Token.class)
					.stream()
					.filter((token) -> !token.getPosValue().startsWith("$"))
					.collect(Collectors.toList());
			
			this.numberOfWords = tokens.size();
		}

		return this.numberOfWords;
	}
	
	private synchronized void runAnalysis() {
		
		this.numberOfWords = Integer.MIN_VALUE;
		
		try {
			this.analyzer.analyze(this.effectiveText, this.language.getLanguage());
		} catch (UIMAException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.jcas = this.analyzer.getJCas();
		System.out.println("Analyzed sentence, resulting jCas size: " + jcas.size() + " bytes.");
		for(Token token : JCasUtil.select(jcas, Token.class)) {
			System.out.println(token.getCoveredText() + ": " + token.getLemmaValue() + " | " 
					+ token.getPosValue() + " | "
					+ token.getMorph().getValue());
		}
	}
	
	
}
