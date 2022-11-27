package de.sda.quotes;

import java.util.Locale;

import de.sda.nlp.analyze.LinguisticAnalyzer;
import de.sda.quotes.model.Quote;

public class AnnotatedQuoteFactory {

	public static NlpAnnotatedQuote getInstanceForLanguage(final Locale locale, final Quote sourceQuote, final LinguisticAnalyzer analyzer) {
		
		final String language = locale.getLanguage();
		
		switch(language) {
			case "de":
				return new AnnotatedGermanQuote(sourceQuote, analyzer);
			case "en":
			default: 
				return new AnnotatedEnglishQuote(sourceQuote, analyzer);
		}
	}
}
