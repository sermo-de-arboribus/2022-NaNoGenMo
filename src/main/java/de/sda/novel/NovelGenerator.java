package de.sda.novel;

import de.sda.literature.LiteratureGenerator;
import de.sda.literature.source.LexicalResourceService;
import de.sda.literature.source.QuotesService;
import de.sda.nlp.analyze.LinguisticAnalyzer;
import de.sda.nlp.analyze.Wordnet;
import de.sda.quotes.AnnotatedQuoteFactory;
import de.sda.quotes.NlpAnnotatedQuote;
import de.sda.quotes.model.Quote;
import de.sda.quotes.model.Quotes;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.core.io.Resource;

public class NovelGenerator implements LiteratureGenerator {

	private static final int MINIMUM_SIZE_IN_WORDS = 50200;
	
	private LinguisticAnalyzer analyzer;
	private Locale languageToBeUsed;
	private LexicalResourceService lexicalResourceService;
	private List<String> genresToBeExcluded = new ArrayList<String>();
	private String[] quoteFiles;
	private NameReplacementService nameService;
	private String outputFilePath;
	private QuotesService quotesService;
    private Logger logger = LoggerFactory.getLogger(NovelGenerator.class);
	
	public NovelGenerator (final QuotesService quotesService, final String[] quoteFiles, final Locale languageToBeUsed, 
			final LinguisticAnalyzer analyzer, final LexicalResourceService lexicalResourceService, final NameReplacementService
			nameService) {
		this.analyzer = analyzer;
		this.languageToBeUsed = languageToBeUsed;
		this.lexicalResourceService = lexicalResourceService;
		this.quoteFiles = quoteFiles;
		this.quotesService = quotesService;
		this.nameService = nameService;
	}
	
	@Override
	public void generateWork(AbstractApplicationContext context) throws IOException {
		int numberOfWordsUsed = 0;
		
		logger.info("Language to be used: " + languageToBeUsed.getLanguage());
		logger.info("Genres to be excluded: " + genresToBeExcluded);
		
		Quotes quotes = readQuoteSources(context);
		filterQuotesByGenre(quotes);
		filterQuotesByLanguage(quotes);
		
		final String lexicalResourcePath = "config/wordnets/" + languageToBeUsed.getLanguage() + ".xml";
		Resource lexicalResource = context.getResource(lexicalResourcePath);
		Wordnet wordnet = lexicalResourceService.loadLexicon(lexicalResource);
		
		List<NlpAnnotatedQuote> annotatedQuotes = quotes.getQuotes()
			.stream()
			.map((quote) -> AnnotatedQuoteFactory.getInstanceForLanguage(this.languageToBeUsed, quote, this.analyzer))
			.collect(Collectors.toList());
		
		Random random = new Random();
		FileWriter writer = new FileWriter(outputFilePath);
		
		while(numberOfWordsUsed < MINIMUM_SIZE_IN_WORDS) {
			
			int index = random.nextInt(annotatedQuotes.size());
			NlpAnnotatedQuote aq = annotatedQuotes.get(index);
			writer.write(aq.getEffectiveText(wordnet, nameService));
			numberOfWordsUsed += aq.getNumberOfWords();
			
			// add paragraph mark at random
			if(random.nextFloat() < 0.2) {
				writer.write(System.lineSeparator());
			}
		}
		
		writer.close();
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
	

	public String getOutputFilePath() {
		return outputFilePath;
	}
	
	private Quotes readQuoteSources(ApplicationContext context) {
		Quotes quotes = new Quotes();
		for(String quotesFile : quoteFiles) {
			List<Quote> quotesList = quotes.getQuotes();
			Quotes additionalQuotes = quotesService.readQuotes(quotesFile, context);
			quotesList.addAll(additionalQuotes.getQuotes());
		}
		return quotes;
	}

	public void setLanguageToBeUsed(final Locale locale) {
		this.languageToBeUsed = locale;
	}
	
	public void setOutputFilePath(String outputFilePath) {
		this.outputFilePath = outputFilePath;
	}
}
