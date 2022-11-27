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
import de.sda.quotes.model.Version;
import de.sda.quotes.model.LexicalResource.Lexicon.LexicalEntry;
import de.sda.quotes.model.LexicalResource.Lexicon.Synset;
import de.sda.quotes.model.LexicalResource.Lexicon.LexicalEntry.Sense;
import de.sda.quotes.model.LexicalResource.Lexicon.Synset.SynsetRelation;

public class AnnotatedEnglishQuote extends AbstractAnnotatedQuote {

	private static List<Character> ENGLISH_VOWELS = List.of('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u');
	
	private LinguisticAnalyzer analyzer;
	private Version effectiveVersion;
	private String effectiveText;
	private long numberOfWords = -1L;
	private List<AnalyzedToken> tokens;
	
	public AnnotatedEnglishQuote(final Quote sourceQuote, final LinguisticAnalyzer analyzer) {

		this.analyzer = analyzer;
		this.effectiveVersion = sourceQuote.getVersions()
				.stream()
				.filter((vers) -> "en".equals(vers.getLang().getLanguage()))
				.findFirst()
				.orElseThrow();
		this.effectiveText = this.effectiveVersion.getText().getContent().get(0).toString();
		
		runAnalysis();
	}
	
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
	
	public long getNumberOfWords() {
		if(this.numberOfWords < 0) {
			this.numberOfWords = this.tokens
				.stream()
				.filter((token) -> !token.isPunctuation())
				.count();
		}

		return this.numberOfWords;
	}
	
	@Override
	protected void replaceNounWithRelatedWord(Wordnet wordnet, Stack<AnalyzedToken> tokenStack, AnalyzedToken tok) {
		
 		AnalyzedToken precedingToken = tokenStack.empty() ? null : tokenStack.peek();

		try {
			
			LexicalEntry entry = wordnet.getEntryForLemma(tok.getLemma());
			List<Sense> senses = entry.getSenses();
			Sense selectedSense = senses.get(random.nextInt(senses.size()));
			String synsetId = ((Synset)selectedSense.getSynset()).getId();
			Synset synset = wordnet.getSynsetById(synsetId);
			if(null != synset.getSynsetRelations() && synset.getSynsetRelations().size() > 0) {
				List<SynsetRelation> synRelations = synset.getSynsetRelations();
				Synset newTarget = (Synset) synRelations.get(random.nextInt(synRelations.size())).getTarget();
				String newTargetId = newTarget.getId(); 
				synset = wordnet.getSynsetById(newTargetId);
			}
			entry = (LexicalEntry) synset.getMembers().get(random.nextInt(synset.getMembers().size()));
			tok.resetLemmaAndSurfaceForm(entry.getLemma().getWrittenForm());
			tokenStack.push(tok);
			
			adjustPrecedingIndefiniteArticle(precedingToken, tok);
			
		} catch (NullPointerException exc) {
			logger.error("Exception occurred when trying to get lexical entry for word " 
					+ tok.getSurfaceForm() + " (lemma " + tok.getLemma() + ")");
			tokenStack.push(tok);
		}
	}
	private void adjustPrecedingIndefiniteArticle(AnalyzedToken precedingToken, AnalyzedToken currentToken) {
		
		if(null != precedingToken && precedingToken.isIndefiniteArticle()) {
			
			boolean firstLetterOfCurrentTokenIsVowel = ENGLISH_VOWELS.contains(currentToken.getSurfaceForm().charAt(0));
			String firstLetterOfArticle = precedingToken.getSurfaceForm().charAt(0) + "";
			
			if(firstLetterOfCurrentTokenIsVowel) {
				precedingToken.setSurfaceForm(firstLetterOfArticle + "n");
			} else {
				precedingToken.setSurfaceForm(firstLetterOfArticle);
			}
		}
	}

	private synchronized void runAnalysis() {
		
		this.numberOfWords = Integer.MIN_VALUE;
		
		try {
			this.tokens = this.analyzer.analyze(this.effectiveText, "en").stream().collect(Collectors.toList());
		} catch (UIMAException | IOException e) {
			
			e.printStackTrace();
			this.tokens = new ArrayList<AnalyzedToken>();
		}
	}
}
