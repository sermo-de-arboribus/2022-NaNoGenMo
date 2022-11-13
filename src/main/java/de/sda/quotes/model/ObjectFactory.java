//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2022.11.13 um 05:55:46 PM CET 
//


package de.sda.quotes.model;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.sda.quotes.model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Title_QNAME = new QName("", "title");
    private final static QName _Idref_QNAME = new QName("", "idref");
    private final static QName _Page_QNAME = new QName("", "page");
    private final static QName _Translator_QNAME = new QName("", "translator");
    private final static QName _Author_QNAME = new QName("", "author");
    private final static QName _TextEm_QNAME = new QName("", "em");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.sda.quotes.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LexicalResource }
     * 
     */
    public LexicalResource createLexicalResource() {
        return new LexicalResource();
    }

    /**
     * Create an instance of {@link LexicalResource.Lexicon }
     * 
     */
    public LexicalResource.Lexicon createLexicalResourceLexicon() {
        return new LexicalResource.Lexicon();
    }

    /**
     * Create an instance of {@link LexicalResource.Lexicon.Synset }
     * 
     */
    public LexicalResource.Lexicon.Synset createLexicalResourceLexiconSynset() {
        return new LexicalResource.Lexicon.Synset();
    }

    /**
     * Create an instance of {@link LexicalResource.Lexicon.LexicalEntry }
     * 
     */
    public LexicalResource.Lexicon.LexicalEntry createLexicalResourceLexiconLexicalEntry() {
        return new LexicalResource.Lexicon.LexicalEntry();
    }

    /**
     * Create an instance of {@link LexicalResource.Lexicon.LexicalEntry.Sense }
     * 
     */
    public LexicalResource.Lexicon.LexicalEntry.Sense createLexicalResourceLexiconLexicalEntrySense() {
        return new LexicalResource.Lexicon.LexicalEntry.Sense();
    }

    /**
     * Create an instance of {@link LexicalResource.Lexicon.LexicalEntry.Form }
     * 
     */
    public LexicalResource.Lexicon.LexicalEntry.Form createLexicalResourceLexiconLexicalEntryForm() {
        return new LexicalResource.Lexicon.LexicalEntry.Form();
    }

    /**
     * Create an instance of {@link LexicalResource.Lexicon.LexicalEntry.Lemma }
     * 
     */
    public LexicalResource.Lexicon.LexicalEntry.Lemma createLexicalResourceLexiconLexicalEntryLemma() {
        return new LexicalResource.Lexicon.LexicalEntry.Lemma();
    }

    /**
     * Create an instance of {@link Quotes }
     * 
     */
    public Quotes createQuotes() {
        return new Quotes();
    }

    /**
     * Create an instance of {@link Quote }
     * 
     */
    public Quote createQuote() {
        return new Quote();
    }

    /**
     * Create an instance of {@link Version }
     * 
     */
    public Version createVersion() {
        return new Version();
    }

    /**
     * Create an instance of {@link Text }
     * 
     */
    public Text createText() {
        return new Text();
    }

    /**
     * Create an instance of {@link Source }
     * 
     */
    public Source createSource() {
        return new Source();
    }

    /**
     * Create an instance of {@link LexicalResource.Lexicon.SyntacticBehaviour }
     * 
     */
    public LexicalResource.Lexicon.SyntacticBehaviour createLexicalResourceLexiconSyntacticBehaviour() {
        return new LexicalResource.Lexicon.SyntacticBehaviour();
    }

    /**
     * Create an instance of {@link LexicalResource.Lexicon.Synset.Definition }
     * 
     */
    public LexicalResource.Lexicon.Synset.Definition createLexicalResourceLexiconSynsetDefinition() {
        return new LexicalResource.Lexicon.Synset.Definition();
    }

    /**
     * Create an instance of {@link LexicalResource.Lexicon.Synset.SynsetRelation }
     * 
     */
    public LexicalResource.Lexicon.Synset.SynsetRelation createLexicalResourceLexiconSynsetSynsetRelation() {
        return new LexicalResource.Lexicon.Synset.SynsetRelation();
    }

    /**
     * Create an instance of {@link LexicalResource.Lexicon.Synset.Example }
     * 
     */
    public LexicalResource.Lexicon.Synset.Example createLexicalResourceLexiconSynsetExample() {
        return new LexicalResource.Lexicon.Synset.Example();
    }

    /**
     * Create an instance of {@link LexicalResource.Lexicon.LexicalEntry.SyntacticBehaviour }
     * 
     */
    public LexicalResource.Lexicon.LexicalEntry.SyntacticBehaviour createLexicalResourceLexiconLexicalEntrySyntacticBehaviour() {
        return new LexicalResource.Lexicon.LexicalEntry.SyntacticBehaviour();
    }

    /**
     * Create an instance of {@link LexicalResource.Lexicon.LexicalEntry.Sense.SenseRelation }
     * 
     */
    public LexicalResource.Lexicon.LexicalEntry.Sense.SenseRelation createLexicalResourceLexiconLexicalEntrySenseSenseRelation() {
        return new LexicalResource.Lexicon.LexicalEntry.Sense.SenseRelation();
    }

    /**
     * Create an instance of {@link LexicalResource.Lexicon.LexicalEntry.Sense.Example }
     * 
     */
    public LexicalResource.Lexicon.LexicalEntry.Sense.Example createLexicalResourceLexiconLexicalEntrySenseExample() {
        return new LexicalResource.Lexicon.LexicalEntry.Sense.Example();
    }

    /**
     * Create an instance of {@link LexicalResource.Lexicon.LexicalEntry.Sense.Count }
     * 
     */
    public LexicalResource.Lexicon.LexicalEntry.Sense.Count createLexicalResourceLexiconLexicalEntrySenseCount() {
        return new LexicalResource.Lexicon.LexicalEntry.Sense.Count();
    }

    /**
     * Create an instance of {@link LexicalResource.Lexicon.LexicalEntry.Form.Pronunciation }
     * 
     */
    public LexicalResource.Lexicon.LexicalEntry.Form.Pronunciation createLexicalResourceLexiconLexicalEntryFormPronunciation() {
        return new LexicalResource.Lexicon.LexicalEntry.Form.Pronunciation();
    }

    /**
     * Create an instance of {@link LexicalResource.Lexicon.LexicalEntry.Form.Tag }
     * 
     */
    public LexicalResource.Lexicon.LexicalEntry.Form.Tag createLexicalResourceLexiconLexicalEntryFormTag() {
        return new LexicalResource.Lexicon.LexicalEntry.Form.Tag();
    }

    /**
     * Create an instance of {@link LexicalResource.Lexicon.LexicalEntry.Lemma.Pronunciation }
     * 
     */
    public LexicalResource.Lexicon.LexicalEntry.Lemma.Pronunciation createLexicalResourceLexiconLexicalEntryLemmaPronunciation() {
        return new LexicalResource.Lexicon.LexicalEntry.Lemma.Pronunciation();
    }

    /**
     * Create an instance of {@link LexicalResource.Lexicon.LexicalEntry.Lemma.Tag }
     * 
     */
    public LexicalResource.Lexicon.LexicalEntry.Lemma.Tag createLexicalResourceLexiconLexicalEntryLemmaTag() {
        return new LexicalResource.Lexicon.LexicalEntry.Lemma.Tag();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "title")
    public JAXBElement<String> createTitle(String value) {
        return new JAXBElement<String>(_Title_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "idref")
    public JAXBElement<BigInteger> createIdref(BigInteger value) {
        return new JAXBElement<BigInteger>(_Idref_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "page")
    public JAXBElement<String> createPage(String value) {
        return new JAXBElement<String>(_Page_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "translator")
    public JAXBElement<String> createTranslator(String value) {
        return new JAXBElement<String>(_Translator_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "author")
    public JAXBElement<String> createAuthor(String value) {
        return new JAXBElement<String>(_Author_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "em", scope = Text.class)
    public JAXBElement<Object> createTextEm(Object value) {
        return new JAXBElement<Object>(_TextEm_QNAME, Object.class, Text.class, value);
    }

}
