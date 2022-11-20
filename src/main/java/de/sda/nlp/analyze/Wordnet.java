package de.sda.nlp.analyze;

import java.util.HashMap;
import java.util.Map;

import de.sda.quotes.model.LexicalResource.Lexicon.LexicalEntry;
import de.sda.quotes.model.LexicalResource.Lexicon.Synset;

public class Wordnet {

	private Map<String, LexicalEntry> lexicalEntryMap = new HashMap<String, LexicalEntry>();
	private Map<String, Synset> synsetMap = new HashMap<String, Synset>();
	
	public Wordnet(Map<String, LexicalEntry> lexicalEntryMap, Map<String, Synset> synsetMap) {
		this.lexicalEntryMap = lexicalEntryMap;
		this.synsetMap = synsetMap;
	}
	
	public LexicalEntry getEntryForLemma(String lemma) {
		return lexicalEntryMap.get(lemma);
	}
	
	public Synset getSynsetById(String id) {
		return synsetMap.get(id);
	}
}
