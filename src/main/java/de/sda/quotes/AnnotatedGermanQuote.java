package de.sda.quotes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.uima.UIMAException;

import de.sda.nlp.analyze.AnalyzedToken;
import de.sda.nlp.analyze.LinguisticAnalyzer;
import de.sda.nlp.analyze.Wordnet;
import de.sda.novel.NameReplacementService;
import de.sda.quotes.model.Quote;

public class AnnotatedGermanQuote extends AbstractAnnotatedQuote implements NlpAnnotatedQuote {

	private long numberOfWords = -1L;
	private List<AnalyzedToken> tokens;
	
	public AnnotatedGermanQuote(final Quote sourceQuote, final LinguisticAnalyzer analyzer) {

		super(sourceQuote, analyzer, "de");		
		runAnalysis();
	}
	@Override
	public String getEffectiveText(Wordnet wordnet, NameReplacementService nameService) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getNumberOfWords() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	private synchronized void runAnalysis() {
		
		this.numberOfWords = Integer.MIN_VALUE;
		
		try {
			this.tokens = this.analyzer.analyze(this.effectiveText, "de").stream().collect(Collectors.toList());
		} catch (UIMAException | IOException e) {
			
			e.printStackTrace();
			this.tokens = new ArrayList<AnalyzedToken>();
		}
	}
}
