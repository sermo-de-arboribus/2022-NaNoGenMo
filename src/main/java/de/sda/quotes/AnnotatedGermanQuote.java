package de.sda.quotes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
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
		if(null == this.tokens) {
			return this.effectiveText;	
		} else {
			Stack<AnalyzedToken> tokenStack  = new Stack<AnalyzedToken>();
			
			this.tokens.stream()
				.forEach((AnalyzedToken tok) -> {
					
					String pos = tok.getPartOfSpeech();
					if((pos.equals("NE") || pos.equals("NNP")) && null != tok.getNamedEntity()) {
						
						processNamedEntity(nameService, tokenStack, tok);
					}
					else if(pos != "NN") {
						tokenStack.push(tok);
					} else {
						replaceNounWithRelatedWord(wordnet, tokenStack, tok);
					}
				});
			
			StringBuilder sb = new StringBuilder();
			while(!tokenStack.empty()) {
				AnalyzedToken token = tokenStack.pop();
				sb.insert(0, token.getSurfaceForm());

				if(token.isOffsetByBlank() && !tokenStack.empty()) {
					sb.insert(0, " ");
				}
			}
			sb.insert(0, " ");
			return sb.toString();
		}
	}
	
	@Override
	public long getNumberOfWords() {
		if(this.numberOfWords < 0) {
			this.numberOfWords = this.tokens
				.stream()
				.filter((token) -> !token.isPunctuation())
				.count();
		}

		return this.numberOfWords;
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
