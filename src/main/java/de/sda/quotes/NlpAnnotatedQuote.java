package de.sda.quotes;

import de.sda.nlp.analyze.Wordnet;
import de.sda.novel.NameReplacementService;

public interface NlpAnnotatedQuote {
	
	public String getEffectiveText(Wordnet wordnet, NameReplacementService nameService);
	public long getNumberOfWords();
}
