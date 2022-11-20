# 2022-NaNoGenMo
National Novel Generation Month 2022

# Resources

## Wordnets

For every output language that you want to produce, you need to provide a Wordnet XML file in the "Lexical Markup Framework compatible" format (cf. https://globalwordnet.github.io/schemas/)
An open source English Wordnet in the required format is available from https://github.com/globalwordnet/english-wordnet, a German one from https://github.com/hdaSprachtechnologie/odenet. For memory efficiency reasons you can consider to filter these large XML files to only contain entries for nouns, as this 2022-NaNoGenMo novel generator only works on replacements for nouns currently. An XSL file for running this filtering can be found under src/main/resources/wordnets/filter-nouns-of-wordnet.xsl.

