# 2022-NaNoGenMo
This repo contains code of an algorithmic novel generator that I wrote for participating in [National Novel Generation Month 2022](https://github.com/NaNoGenMo/2022).

Based on some source material the algorithm runs some permutations on nouns and names (named entities) by replacing them with related words. (Related nouns could be synonyms, hypernyms or hyponyms; names are taken from a pre-configured list of names.) The source material is mostly called "quotes" here, as my original idea was to use many quotes from many different writers as the language material; however, you could also treat a complete human-written novel as a single "quote" and use it as input to the permutation algorithm. See configuration section below.)

To determine what words the algorithm could and should replace, an NLP pipeline is first run on the source material, doing sentence segmenation, tokenizing, lemmatizing, part-of-speech-tagging, morphological tagging and named entity recognition. The current setup uses [DKPro core](https://dkpro.github.io/dkpro-core/) to configure and process this pipeline and has been tested for inputs in English and German. In theory it should be possible to adjust this project to work for other input languages, too, as long as NLP components, that are compatible with DKPro / Apacha UIMA, are available for these languages.

# Requirements

* Java (tested with Java 17)
* Maven (tested wth Maven 3.6.3)

# Setup and usage

* Clone this repo,
* enter the root directory and 
* build the project with `mvn clean package`.
* Take the .zip archive, whose name is starting with "NaNoGenMo2022", extract it to a location of your choice and navigate to this unzipped folder (called exactly "NaNoGenMo2022" - we'll refer to it as "the program folder" from now on).
* Run the program with `java -cp ./lib/*:. de.sda.novel.NovelGeneratorApplication` (on Linux / MacOS) or with `java -cp ./lib/*;. de.sda.novel.NovelGeneratorApplication` (on Windows).
* If you didn't change the default configuration, your generated novel will be output to a file named "generated-novel.txt"

# Configuration

In the program folder you'll find a sub-directory named "config". The main configuration file is `applicationContext.xml` which provides [bean definitions using the Spring framework](https://docs.spring.io/spring-framework/docs/5.3.x/reference/html/core.html#beans-factory-metadata). Some of the bean arguments can by adjusted to change the behaviour of the novel generator easily:

## Simple configuration options

* If you want to change the list of person and location names that the program uses to substitute named entities from the source material, change the `constructor-arg`s called "personNames" and "placeNames" of the bean with the id "nameReplacementService".
* In the default setup, two files with source materials are expected in the config folder, with file names "copyrighted-quotes.xml" and "public-domain-quotes.xml" respectively. You can change the "quoteFiles" `constructor-arg` of the `novelGenerator` bean if you want to use different input files. On details about the file format, see below.
* The quotes in the source file may be classified by genre. If you want to exclude some genres from usage in the novel generator, you can adjust the list within the "genresToBeExcluded" option of the "novelGenerator" bean.
* The language of every quote in the source file is marked by an ISO language code attribute, so a single quotes source file can have quotes in many different languages. The novel generator however assumes that you want to output a novel in a certain target language. The target language is configured in the "language" `constructor-arg` of the "targetLocale" bean.
* All other configuration options in `applicationContext.xml` should only be touched if you are familiar with the Spring framework's bean configuration system. One advanced configuration option that you might want to touch is e. g. the "linguisticAnalyzer" bean definition, where you can select a different lemmatizer to be used in the NLP pipeline. If you change the lemmatizer class you should also remember to drop the .jar file for your requested lemmatizer into the `libs` directory.
* The output filename of the generated novel can be set via "outputFilePath" on the "novelGenerator" bean.

## Source material files ("quote" files)
In the project's config folder you'll see a file named `public-domain-quotes.xml` that you can use as a sample for how input files should be structured. You'll also find an XML Schema file `quotes-schema.xsd` in the same folder which you can use in a schema-aware XML editor for guided editing.

Every quote has at least one version, but it can have several versions. Versions are basically classified by `original` and `translation` (there's also an option `unpublished`, which implies that this is a translation, but one, that has not been officially published). Every version has a `@lang` attribute that expects [ISO 639 codes](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) for the language, followed by an optional hyphen with an [ISO 3166-1 country code](https://en.wikipedia.org/wiki/ISO_3166-1). Every version is also expected to have a `@public-domain` attribute giving the year starting from which this version of the quote is in the public domain and not copyrighted anymore.

The novel generator only uses the `@genre` abd `@lang` attributes and certainly the `<text>` content of quotes and versions. The remaining metadata (like `<source>` and `<author>`) are ignored. (This file format has not been developed for the novel generator, but is the format that I use for collecting my favorite quotes for many years already. That's why it has more data than strictly necessary for the novel generator's purposes.)


## Wordnets

For every output language that you want to produce, you need to provide a Wordnet XML file in the "Lexical Markup Framework compatible" format (cf. https://globalwordnet.github.io/schemas/)
An open source English Wordnet in the required format is available from https://github.com/globalwordnet/english-wordnet, a German one from https://github.com/hdaSprachtechnologie/odenet. For memory efficiency reasons you can consider to filter these large XML files to only contain entries for nouns, as this 2022-NaNoGenMo novel generator only works on replacements for nouns currently. An XSL file for running this filtering can be found under src/main/resources/wordnets/filter-nouns-of-wordnet.xsl.
Place your wordnet file in the subdirectory ./config/wordnets of your program folder. Name the file with the ISO-639 language code that you use in your language option (see "Simple configuration options" above) plus the ".xml" extension.
