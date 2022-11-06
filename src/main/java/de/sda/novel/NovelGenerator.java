package de.sda.novel;

import de.sda.literature.LiteratureGenerator;
import de.sda.literature.source.QuotesService;
import de.sda.quotes.model.Quote;
import de.sda.quotes.model.Quotes;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class NovelGenerator implements LiteratureGenerator {

	private Locale languageToBeUsed;
	private List<String> genresToBeExcluded = new ArrayList<String>();
	private String[] quoteFiles;
	private QuotesService quotesService;
	
	public NovelGenerator (final QuotesService quotesService, final String[] quoteFiles, final Locale languageToBeUsed) {
		this.languageToBeUsed = languageToBeUsed;
		this.quoteFiles = quoteFiles;
		this.quotesService = quotesService;
	}
	
	@Override
	public void generateWork() {
		System.out.println("Language to be used: " + languageToBeUsed.getLanguage());
		System.out.println("Genres to be excluded: " + genresToBeExcluded);
		
		Quotes quotes = new Quotes();
		for(String quotesFile : quoteFiles) {
			List<Quote> quotesList = quotes.getQuotes();
			Quotes additionalQuotes = quotesService.readQuotes(quotesFile);
			quotesList.addAll(additionalQuotes.getQuotes());
		}
		
		filterQuotesByGenre(quotes);
		filterQuotesByLanguage(quotes);
		
		for(Quote quote : quotes.getQuotes()) {
			
			quote.getVersions()
				.stream()
				.filter((vers) -> this.languageToBeUsed.getLanguage().equals(vers.getLang().getLanguage()))
				.forEach((vers) -> System.out.println(vers.getText().getContent()));
		}
	}

	public void setLanguageToBeUsed(final Locale locale) {
		this.languageToBeUsed = locale;
	}
	
	public void setGenresToBeExcluded(final List<String> excludes) {
		this.genresToBeExcluded = excludes;
	}
	
	private void filterQuotesByGenre(Quotes quotes) {
		List<Quote> quotesList = quotes.getQuotes();
		List<Quote> filteredList = quotesList
			.stream()
			.filter(quote -> !this.genresToBeExcluded.contains(quote.getGenre()))
			.collect(Collectors.toList());
		
		if(filteredList.size() > 0) {
			quotesList.clear();
			quotesList.addAll(filteredList);
		}
	}
	
	private void filterQuotesByLanguage(Quotes quotes) {
		List<Quote> quotesList = quotes.getQuotes();
		List<Quote> filteredList = quotesList
			.stream()
			.filter(
					(quote) -> quote.getVersions()
						.stream()
						.anyMatch((version) -> this.languageToBeUsed.getLanguage().equals(version.getLang().getLanguage()))
					)
			.collect(Collectors.toList());
		
		if(filteredList.size() > 0) {
			quotesList.clear();
			quotesList.addAll(filteredList);
		}
	}
}
