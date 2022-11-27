package de.sda.quotes;

import java.util.List;
import java.util.Random;
import java.util.Stack;

import javax.xml.bind.JAXBElement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Element;

import de.sda.nlp.analyze.AnalyzedToken;
import de.sda.nlp.analyze.LinguisticAnalyzer;
import de.sda.nlp.analyze.NamedEntityToken;
import de.sda.nlp.analyze.Wordnet;
import de.sda.novel.NameReplacementService;
import de.sda.quotes.model.Quote;
import de.sda.quotes.model.Version;
import de.sda.quotes.model.LexicalResource.Lexicon.LexicalEntry;
import de.sda.quotes.model.LexicalResource.Lexicon.Synset;
import de.sda.quotes.model.LexicalResource.Lexicon.LexicalEntry.Sense;
import de.sda.quotes.model.LexicalResource.Lexicon.Synset.SynsetRelation;

public abstract class AbstractAnnotatedQuote implements NlpAnnotatedQuote {
	
	protected LinguisticAnalyzer analyzer;
	protected String effectiveText;
	protected Version effectiveVersion;	
	protected Logger logger = LoggerFactory.getLogger(NlpAnnotatedQuote.class);
	protected Random random = new Random();

	AbstractAnnotatedQuote(final Quote sourceQuote, final LinguisticAnalyzer analyzer, String language) {
		this.analyzer = analyzer;
		this.effectiveVersion = sourceQuote.getVersions()
				.stream()
				.filter((vers) -> language.equals(vers.getLang().getLanguage()))
				.findFirst()
				.orElseThrow();
		StringBuilder sb = new StringBuilder();
		for(Object part : this.effectiveVersion.getText().getContent()) {
			if(part instanceof String) {
				sb.append((String) part);
			} else if(part instanceof JAXBElement) {
				Object value = ((JAXBElement) part).getValue();
				if(value instanceof Element) {
					String text = ((Element) value).getTextContent();
					sb.append(text);
				}
			}
		}
		this.effectiveText = sb.toString();
	}
	
	protected void processNamedEntity(NameReplacementService nameService, Stack<AnalyzedToken> tokenStack, AnalyzedToken tok) {
		
		NamedEntityToken namedEntity = tok.getNamedEntity();
		String currentEntityType = namedEntity.getType();
		
		AnalyzedToken precedingToken = tokenStack.empty() ? null : tokenStack.peek();
		
		if( null != precedingToken && null != precedingToken.getNamedEntity() 
				&& precedingToken.getNamedEntity().getType() == currentEntityType) {
			// ignore the current token, we assume this is part of a multi-part named entity
		} else {
			switch(currentEntityType) {
				case("person"):
					String replacementName = nameService.replacePersonName(tok.getSurfaceForm());
					tok.resetLemmaAndSurfaceForm(replacementName);
					tokenStack.push(tok);
					break;
				case("location"):
					String replacementLocation = nameService.replacePlaceName(tok.getSurfaceForm());
					tok.resetLemmaAndSurfaceForm(replacementLocation);
					tokenStack.push(tok);
					break;
				default:
					tokenStack.push(tok);
			}
		}
	}
	
	protected void replaceNounWithRelatedWord(Wordnet wordnet, Stack<AnalyzedToken> tokenStack, AnalyzedToken tok) {
		
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
			
		} catch (NullPointerException exc) {
			logger.error("Exception occurred when trying to get lexical entry for word " 
					+ tok.getSurfaceForm() + " (lemma " + tok.getLemma() + ")");
			tokenStack.push(tok);
		}
	}
}
