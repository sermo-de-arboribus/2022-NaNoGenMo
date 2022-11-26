package de.sda.quotes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Random;

import org.apache.uima.UIMAException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.sda.nlp.analyze.AnalyzedToken;
import de.sda.nlp.analyze.LinguisticAnalyzer;
import de.sda.nlp.analyze.NamedEntityToken;
import de.sda.nlp.analyze.Wordnet;
import de.sda.novel.NameReplacementService;
import de.sda.quotes.model.LexicalResource.Lexicon.LexicalEntry;
import de.sda.quotes.model.LexicalResource.Lexicon.LexicalEntry.Sense;
import de.sda.quotes.model.LexicalResource.Lexicon.Synset;
import de.sda.quotes.model.LexicalResource.Lexicon.Synset.SynsetRelation;
import de.sda.quotes.model.Quote;
import de.sda.quotes.model.Version;

public class NlpAnnotatedQuote {
	
	private LinguisticAnalyzer analyzer;
	private Locale language;
	private Version effectiveVersion;
	private String effectiveText;
	private Logger logger = LoggerFactory.getLogger(NlpAnnotatedQuote.class);
	private long numberOfWords = -1L;
	private Random random = new Random();
	private Collection<AnalyzedToken> tokens;
	
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
	
	public String getEffectiveText(Wordnet wordnet, NameReplacementService nameService) {
		if(null == this.tokens) {
			return this.effectiveText;	
		} else {
			StringBuilder sb = new StringBuilder();
			this.tokens.stream()
				.forEach((AnalyzedToken tok) -> {
					String pos = tok.getPartOfSpeech();
					if((pos.equals("NE") || pos.equals("NNP")) && null != tok.getNamedEntity()) {
						
						sb.append(" ");
						
						NamedEntityToken namedEntity = tok.getNamedEntity();
						
						switch(namedEntity.getType()) {
							case("person"):
								sb.append(nameService.replacePersonName(tok.getSurfaceForm()));
								break;
							case("location"):
								sb.append(nameService.replacePlaceName(tok.getSurfaceForm()));
								break;
							default:
								sb.append(tok.getSurfaceForm());
						}
					}
					else if(pos != "NN") {
						if(tok.isOffsetByBlank()) {
							sb.append(" ");
						}
						sb.append(tok.getSurfaceForm());
					} else {
						
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
							sb.append(" ");	
							sb.append(entry.getLemma().getWrittenForm());
						} catch (NullPointerException exc) {
							logger.error("Exception occurred when trying to get lexical entry for word " 
									+ tok.getSurfaceForm() + " (lemma " + tok.getLemma() + ")");
							sb.append(" ");
							sb.append(tok.getSurfaceForm());
						}
					}
				});
			return sb.toString();
		}
		
	}
	
	public long getNumberOfWords() {
		if(this.numberOfWords < 0) {
			this.numberOfWords = this.tokens
				.stream()
				.filter((token) -> !token.getPartOfSpeech().startsWith("$"))
				.count();
		}

		return this.numberOfWords;
	}
	
	private synchronized void runAnalysis() {
		
		this.numberOfWords = Integer.MIN_VALUE;
		
		try {
			this.tokens = this.analyzer.analyze(this.effectiveText, this.language.getLanguage());
		} catch (UIMAException | IOException e) {
			
			e.printStackTrace();
			this.tokens = new ArrayList<AnalyzedToken>();
		}
	}
}
