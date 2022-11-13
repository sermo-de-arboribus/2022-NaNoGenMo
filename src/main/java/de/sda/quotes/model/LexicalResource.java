//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2022.11.13 um 05:55:46 PM CET 
//


package de.sda.quotes.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;element name="Lexicon"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LexicalEntry" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Lemma"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Pronunciation" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;attGroup ref="{}attlist.Pronunciation"/&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="Tag" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;attGroup ref="{}attlist.Tag"/&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                     &lt;attGroup ref="{}attlist.Lemma"/&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Form" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Pronunciation" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;attGroup ref="{}attlist.Pronunciation"/&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="Tag" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;attGroup ref="{}attlist.Tag"/&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                     &lt;attGroup ref="{}attlist.Form"/&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Sense" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="SenseRelation" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;attGroup ref="{}attlist.SenseRelation"/&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="Example" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;attGroup ref="{}attlist.Example"/&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="Count" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;attGroup ref="{}attlist.Count"/&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                     &lt;attGroup ref="{}attlist.Sense"/&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="SyntacticBehaviour" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attGroup ref="{}attlist.SyntacticBehaviour"/&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attGroup ref="{}attlist.LexicalEntry"/&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Synset" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Definition" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attGroup ref="{}attlist.Definition"/&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="SynsetRelation" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attGroup ref="{}attlist.SynsetRelation"/&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Example" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attGroup ref="{}attlist.Example"/&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attGroup ref="{}attlist.Synset"/&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SyntacticBehaviour" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attGroup ref="{}attlist.SyntacticBehaviour"/&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attGroup ref="{}attlist.Lexicon"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "lexicons"
})
@XmlRootElement(name = "LexicalResource")
public class LexicalResource {

    @XmlElement(name = "Lexicon")
    protected List<LexicalResource.Lexicon> lexicons;

    /**
     * Gets the value of the lexicons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lexicons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLexicons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LexicalResource.Lexicon }
     * 
     * 
     */
    public List<LexicalResource.Lexicon> getLexicons() {
        if (lexicons == null) {
            lexicons = new ArrayList<LexicalResource.Lexicon>();
        }
        return this.lexicons;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="LexicalEntry" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Lemma"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Pronunciation" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;attGroup ref="{}attlist.Pronunciation"/&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="Tag" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;attGroup ref="{}attlist.Tag"/&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                           &lt;attGroup ref="{}attlist.Lemma"/&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Form" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Pronunciation" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;attGroup ref="{}attlist.Pronunciation"/&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="Tag" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;attGroup ref="{}attlist.Tag"/&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                           &lt;attGroup ref="{}attlist.Form"/&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Sense" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="SenseRelation" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;attGroup ref="{}attlist.SenseRelation"/&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="Example" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;attGroup ref="{}attlist.Example"/&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="Count" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;attGroup ref="{}attlist.Count"/&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                           &lt;attGroup ref="{}attlist.Sense"/&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="SyntacticBehaviour" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attGroup ref="{}attlist.SyntacticBehaviour"/&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attGroup ref="{}attlist.LexicalEntry"/&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Synset" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Definition" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attGroup ref="{}attlist.Definition"/&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="SynsetRelation" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attGroup ref="{}attlist.SynsetRelation"/&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Example" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attGroup ref="{}attlist.Example"/&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attGroup ref="{}attlist.Synset"/&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="SyntacticBehaviour" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attGroup ref="{}attlist.SyntacticBehaviour"/&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attGroup ref="{}attlist.Lexicon"/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "lexicalEntries",
        "synsets",
        "syntacticBehaviours"
    })
    public static class Lexicon {

        @XmlElement(name = "LexicalEntry")
        protected List<LexicalResource.Lexicon.LexicalEntry> lexicalEntries;
        @XmlElement(name = "Synset")
        protected List<LexicalResource.Lexicon.Synset> synsets;
        @XmlElement(name = "SyntacticBehaviour")
        protected List<LexicalResource.Lexicon.SyntacticBehaviour> syntacticBehaviours;
        @XmlAttribute(name = "id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String id;
        @XmlAttribute(name = "label", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected String label;
        @XmlAttribute(name = "language", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected String language;
        @XmlAttribute(name = "email", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected String email;
        @XmlAttribute(name = "license", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected String license;
        @XmlAttribute(name = "version", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected String version;
        @XmlAttribute(name = "url")
        @XmlSchemaType(name = "anySimpleType")
        protected String url;
        @XmlAttribute(name = "citation")
        @XmlSchemaType(name = "anySimpleType")
        protected String citation;
        @XmlAttribute(name = "logo")
        @XmlSchemaType(name = "anySimpleType")
        protected String logo;
        @XmlAttribute(name = "contributor", namespace = "https://globalwordnet.github.io/schemas/dc/")
        @XmlSchemaType(name = "anySimpleType")
        protected String contributor;
        @XmlAttribute(name = "coverage", namespace = "https://globalwordnet.github.io/schemas/dc/")
        @XmlSchemaType(name = "anySimpleType")
        protected String coverage;
        @XmlAttribute(name = "creator", namespace = "https://globalwordnet.github.io/schemas/dc/")
        @XmlSchemaType(name = "anySimpleType")
        protected String creator;
        @XmlAttribute(name = "date", namespace = "https://globalwordnet.github.io/schemas/dc/")
        @XmlSchemaType(name = "anySimpleType")
        protected String date;
        @XmlAttribute(name = "description", namespace = "https://globalwordnet.github.io/schemas/dc/")
        @XmlSchemaType(name = "anySimpleType")
        protected String description;
        @XmlAttribute(name = "format", namespace = "https://globalwordnet.github.io/schemas/dc/")
        @XmlSchemaType(name = "anySimpleType")
        protected String format;
        @XmlAttribute(name = "identifier", namespace = "https://globalwordnet.github.io/schemas/dc/")
        @XmlSchemaType(name = "anySimpleType")
        protected String identifier;
        @XmlAttribute(name = "publisher", namespace = "https://globalwordnet.github.io/schemas/dc/")
        @XmlSchemaType(name = "anySimpleType")
        protected String publisher;
        @XmlAttribute(name = "relation", namespace = "https://globalwordnet.github.io/schemas/dc/")
        @XmlSchemaType(name = "anySimpleType")
        protected String relation;
        @XmlAttribute(name = "rights", namespace = "https://globalwordnet.github.io/schemas/dc/")
        @XmlSchemaType(name = "anySimpleType")
        protected String rights;
        @XmlAttribute(name = "source", namespace = "https://globalwordnet.github.io/schemas/dc/")
        @XmlSchemaType(name = "anySimpleType")
        protected String source;
        @XmlAttribute(name = "subject", namespace = "https://globalwordnet.github.io/schemas/dc/")
        @XmlSchemaType(name = "anySimpleType")
        protected String subject;
        @XmlAttribute(name = "title", namespace = "https://globalwordnet.github.io/schemas/dc/")
        @XmlSchemaType(name = "anySimpleType")
        protected String title;
        @XmlAttribute(name = "type", namespace = "https://globalwordnet.github.io/schemas/dc/")
        @XmlSchemaType(name = "anySimpleType")
        protected String type;
        @XmlAttribute(name = "status")
        @XmlSchemaType(name = "anySimpleType")
        protected String status;
        @XmlAttribute(name = "note")
        @XmlSchemaType(name = "anySimpleType")
        protected String note;
        @XmlAttribute(name = "confidenceScore")
        @XmlSchemaType(name = "anySimpleType")
        protected String confidenceScore;

        /**
         * Gets the value of the lexicalEntries property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the lexicalEntries property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLexicalEntries().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LexicalResource.Lexicon.LexicalEntry }
         * 
         * 
         */
        public List<LexicalResource.Lexicon.LexicalEntry> getLexicalEntries() {
            if (lexicalEntries == null) {
                lexicalEntries = new ArrayList<LexicalResource.Lexicon.LexicalEntry>();
            }
            return this.lexicalEntries;
        }

        /**
         * Gets the value of the synsets property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the synsets property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSynsets().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LexicalResource.Lexicon.Synset }
         * 
         * 
         */
        public List<LexicalResource.Lexicon.Synset> getSynsets() {
            if (synsets == null) {
                synsets = new ArrayList<LexicalResource.Lexicon.Synset>();
            }
            return this.synsets;
        }

        /**
         * Gets the value of the syntacticBehaviours property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the syntacticBehaviours property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSyntacticBehaviours().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LexicalResource.Lexicon.SyntacticBehaviour }
         * 
         * 
         */
        public List<LexicalResource.Lexicon.SyntacticBehaviour> getSyntacticBehaviours() {
            if (syntacticBehaviours == null) {
                syntacticBehaviours = new ArrayList<LexicalResource.Lexicon.SyntacticBehaviour>();
            }
            return this.syntacticBehaviours;
        }

        /**
         * Ruft den Wert der id-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Legt den Wert der id-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

        /**
         * Ruft den Wert der label-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLabel() {
            return label;
        }

        /**
         * Legt den Wert der label-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLabel(String value) {
            this.label = value;
        }

        /**
         * Ruft den Wert der language-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLanguage() {
            return language;
        }

        /**
         * Legt den Wert der language-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLanguage(String value) {
            this.language = value;
        }

        /**
         * Ruft den Wert der email-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmail() {
            return email;
        }

        /**
         * Legt den Wert der email-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmail(String value) {
            this.email = value;
        }

        /**
         * Ruft den Wert der license-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLicense() {
            return license;
        }

        /**
         * Legt den Wert der license-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLicense(String value) {
            this.license = value;
        }

        /**
         * Ruft den Wert der version-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVersion() {
            return version;
        }

        /**
         * Legt den Wert der version-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVersion(String value) {
            this.version = value;
        }

        /**
         * Ruft den Wert der url-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUrl() {
            return url;
        }

        /**
         * Legt den Wert der url-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUrl(String value) {
            this.url = value;
        }

        /**
         * Ruft den Wert der citation-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCitation() {
            return citation;
        }

        /**
         * Legt den Wert der citation-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCitation(String value) {
            this.citation = value;
        }

        /**
         * Ruft den Wert der logo-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLogo() {
            return logo;
        }

        /**
         * Legt den Wert der logo-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLogo(String value) {
            this.logo = value;
        }

        /**
         * Ruft den Wert der contributor-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContributor() {
            return contributor;
        }

        /**
         * Legt den Wert der contributor-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContributor(String value) {
            this.contributor = value;
        }

        /**
         * Ruft den Wert der coverage-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCoverage() {
            return coverage;
        }

        /**
         * Legt den Wert der coverage-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCoverage(String value) {
            this.coverage = value;
        }

        /**
         * Ruft den Wert der creator-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCreator() {
            return creator;
        }

        /**
         * Legt den Wert der creator-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCreator(String value) {
            this.creator = value;
        }

        /**
         * Ruft den Wert der date-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDate() {
            return date;
        }

        /**
         * Legt den Wert der date-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDate(String value) {
            this.date = value;
        }

        /**
         * Ruft den Wert der description-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * Legt den Wert der description-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

        /**
         * Ruft den Wert der format-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFormat() {
            return format;
        }

        /**
         * Legt den Wert der format-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFormat(String value) {
            this.format = value;
        }

        /**
         * Ruft den Wert der identifier-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdentifier() {
            return identifier;
        }

        /**
         * Legt den Wert der identifier-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdentifier(String value) {
            this.identifier = value;
        }

        /**
         * Ruft den Wert der publisher-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPublisher() {
            return publisher;
        }

        /**
         * Legt den Wert der publisher-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPublisher(String value) {
            this.publisher = value;
        }

        /**
         * Ruft den Wert der relation-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRelation() {
            return relation;
        }

        /**
         * Legt den Wert der relation-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRelation(String value) {
            this.relation = value;
        }

        /**
         * Ruft den Wert der rights-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRights() {
            return rights;
        }

        /**
         * Legt den Wert der rights-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRights(String value) {
            this.rights = value;
        }

        /**
         * Ruft den Wert der source-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSource() {
            return source;
        }

        /**
         * Legt den Wert der source-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSource(String value) {
            this.source = value;
        }

        /**
         * Ruft den Wert der subject-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubject() {
            return subject;
        }

        /**
         * Legt den Wert der subject-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubject(String value) {
            this.subject = value;
        }

        /**
         * Ruft den Wert der title-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTitle() {
            return title;
        }

        /**
         * Legt den Wert der title-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTitle(String value) {
            this.title = value;
        }

        /**
         * Ruft den Wert der type-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Legt den Wert der type-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

        /**
         * Ruft den Wert der status-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatus() {
            return status;
        }

        /**
         * Legt den Wert der status-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatus(String value) {
            this.status = value;
        }

        /**
         * Ruft den Wert der note-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNote() {
            return note;
        }

        /**
         * Legt den Wert der note-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNote(String value) {
            this.note = value;
        }

        /**
         * Ruft den Wert der confidenceScore-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConfidenceScore() {
            if (confidenceScore == null) {
                return "1.0";
            } else {
                return confidenceScore;
            }
        }

        /**
         * Legt den Wert der confidenceScore-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConfidenceScore(String value) {
            this.confidenceScore = value;
        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="Lemma"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Pronunciation" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;attGroup ref="{}attlist.Pronunciation"/&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="Tag" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;attGroup ref="{}attlist.Tag"/&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *                 &lt;attGroup ref="{}attlist.Lemma"/&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Form" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Pronunciation" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;attGroup ref="{}attlist.Pronunciation"/&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="Tag" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;attGroup ref="{}attlist.Tag"/&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *                 &lt;attGroup ref="{}attlist.Form"/&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Sense" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="SenseRelation" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;attGroup ref="{}attlist.SenseRelation"/&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="Example" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;attGroup ref="{}attlist.Example"/&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="Count" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;attGroup ref="{}attlist.Count"/&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *                 &lt;attGroup ref="{}attlist.Sense"/&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="SyntacticBehaviour" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attGroup ref="{}attlist.SyntacticBehaviour"/&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attGroup ref="{}attlist.LexicalEntry"/&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "lemma",
            "forms",
            "senses",
            "syntacticBehaviours"
        })
        public static class LexicalEntry {

            @XmlElement(name = "Lemma", required = true)
            protected LexicalResource.Lexicon.LexicalEntry.Lemma lemma;
            @XmlElement(name = "Form")
            protected List<LexicalResource.Lexicon.LexicalEntry.Form> forms;
            @XmlElement(name = "Sense")
            protected List<LexicalResource.Lexicon.LexicalEntry.Sense> senses;
            @XmlElement(name = "SyntacticBehaviour")
            protected List<LexicalResource.Lexicon.LexicalEntry.SyntacticBehaviour> syntacticBehaviours;
            @XmlAttribute(name = "id", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String id;
            @XmlAttribute(name = "contributor", namespace = "https://globalwordnet.github.io/schemas/dc/")
            @XmlSchemaType(name = "anySimpleType")
            protected String contributor;
            @XmlAttribute(name = "coverage", namespace = "https://globalwordnet.github.io/schemas/dc/")
            @XmlSchemaType(name = "anySimpleType")
            protected String coverage;
            @XmlAttribute(name = "creator", namespace = "https://globalwordnet.github.io/schemas/dc/")
            @XmlSchemaType(name = "anySimpleType")
            protected String creator;
            @XmlAttribute(name = "date", namespace = "https://globalwordnet.github.io/schemas/dc/")
            @XmlSchemaType(name = "anySimpleType")
            protected String date;
            @XmlAttribute(name = "description", namespace = "https://globalwordnet.github.io/schemas/dc/")
            @XmlSchemaType(name = "anySimpleType")
            protected String description;
            @XmlAttribute(name = "format", namespace = "https://globalwordnet.github.io/schemas/dc/")
            @XmlSchemaType(name = "anySimpleType")
            protected String format;
            @XmlAttribute(name = "identifier", namespace = "https://globalwordnet.github.io/schemas/dc/")
            @XmlSchemaType(name = "anySimpleType")
            protected String identifier;
            @XmlAttribute(name = "publisher", namespace = "https://globalwordnet.github.io/schemas/dc/")
            @XmlSchemaType(name = "anySimpleType")
            protected String publisher;
            @XmlAttribute(name = "relation", namespace = "https://globalwordnet.github.io/schemas/dc/")
            @XmlSchemaType(name = "anySimpleType")
            protected String relation;
            @XmlAttribute(name = "rights", namespace = "https://globalwordnet.github.io/schemas/dc/")
            @XmlSchemaType(name = "anySimpleType")
            protected String rights;
            @XmlAttribute(name = "source", namespace = "https://globalwordnet.github.io/schemas/dc/")
            @XmlSchemaType(name = "anySimpleType")
            protected String source;
            @XmlAttribute(name = "subject", namespace = "https://globalwordnet.github.io/schemas/dc/")
            @XmlSchemaType(name = "anySimpleType")
            protected String subject;
            @XmlAttribute(name = "title", namespace = "https://globalwordnet.github.io/schemas/dc/")
            @XmlSchemaType(name = "anySimpleType")
            protected String title;
            @XmlAttribute(name = "type", namespace = "https://globalwordnet.github.io/schemas/dc/")
            @XmlSchemaType(name = "anySimpleType")
            protected String type;
            @XmlAttribute(name = "status")
            @XmlSchemaType(name = "anySimpleType")
            protected String status;
            @XmlAttribute(name = "note")
            @XmlSchemaType(name = "anySimpleType")
            protected String note;
            @XmlAttribute(name = "confidenceScore")
            @XmlSchemaType(name = "anySimpleType")
            protected String confidenceScore;

            /**
             * Ruft den Wert der lemma-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link LexicalResource.Lexicon.LexicalEntry.Lemma }
             *     
             */
            public LexicalResource.Lexicon.LexicalEntry.Lemma getLemma() {
                return lemma;
            }

            /**
             * Legt den Wert der lemma-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link LexicalResource.Lexicon.LexicalEntry.Lemma }
             *     
             */
            public void setLemma(LexicalResource.Lexicon.LexicalEntry.Lemma value) {
                this.lemma = value;
            }

            /**
             * Gets the value of the forms property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the forms property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getForms().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link LexicalResource.Lexicon.LexicalEntry.Form }
             * 
             * 
             */
            public List<LexicalResource.Lexicon.LexicalEntry.Form> getForms() {
                if (forms == null) {
                    forms = new ArrayList<LexicalResource.Lexicon.LexicalEntry.Form>();
                }
                return this.forms;
            }

            /**
             * Gets the value of the senses property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the senses property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSenses().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link LexicalResource.Lexicon.LexicalEntry.Sense }
             * 
             * 
             */
            public List<LexicalResource.Lexicon.LexicalEntry.Sense> getSenses() {
                if (senses == null) {
                    senses = new ArrayList<LexicalResource.Lexicon.LexicalEntry.Sense>();
                }
                return this.senses;
            }

            /**
             * Gets the value of the syntacticBehaviours property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the syntacticBehaviours property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSyntacticBehaviours().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link LexicalResource.Lexicon.LexicalEntry.SyntacticBehaviour }
             * 
             * 
             */
            public List<LexicalResource.Lexicon.LexicalEntry.SyntacticBehaviour> getSyntacticBehaviours() {
                if (syntacticBehaviours == null) {
                    syntacticBehaviours = new ArrayList<LexicalResource.Lexicon.LexicalEntry.SyntacticBehaviour>();
                }
                return this.syntacticBehaviours;
            }

            /**
             * Ruft den Wert der id-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * Legt den Wert der id-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
            }

            /**
             * Ruft den Wert der contributor-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContributor() {
                return contributor;
            }

            /**
             * Legt den Wert der contributor-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setContributor(String value) {
                this.contributor = value;
            }

            /**
             * Ruft den Wert der coverage-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCoverage() {
                return coverage;
            }

            /**
             * Legt den Wert der coverage-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCoverage(String value) {
                this.coverage = value;
            }

            /**
             * Ruft den Wert der creator-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCreator() {
                return creator;
            }

            /**
             * Legt den Wert der creator-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCreator(String value) {
                this.creator = value;
            }

            /**
             * Ruft den Wert der date-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDate() {
                return date;
            }

            /**
             * Legt den Wert der date-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDate(String value) {
                this.date = value;
            }

            /**
             * Ruft den Wert der description-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescription() {
                return description;
            }

            /**
             * Legt den Wert der description-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescription(String value) {
                this.description = value;
            }

            /**
             * Ruft den Wert der format-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFormat() {
                return format;
            }

            /**
             * Legt den Wert der format-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFormat(String value) {
                this.format = value;
            }

            /**
             * Ruft den Wert der identifier-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIdentifier() {
                return identifier;
            }

            /**
             * Legt den Wert der identifier-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIdentifier(String value) {
                this.identifier = value;
            }

            /**
             * Ruft den Wert der publisher-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPublisher() {
                return publisher;
            }

            /**
             * Legt den Wert der publisher-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPublisher(String value) {
                this.publisher = value;
            }

            /**
             * Ruft den Wert der relation-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRelation() {
                return relation;
            }

            /**
             * Legt den Wert der relation-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRelation(String value) {
                this.relation = value;
            }

            /**
             * Ruft den Wert der rights-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRights() {
                return rights;
            }

            /**
             * Legt den Wert der rights-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRights(String value) {
                this.rights = value;
            }

            /**
             * Ruft den Wert der source-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSource() {
                return source;
            }

            /**
             * Legt den Wert der source-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSource(String value) {
                this.source = value;
            }

            /**
             * Ruft den Wert der subject-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSubject() {
                return subject;
            }

            /**
             * Legt den Wert der subject-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSubject(String value) {
                this.subject = value;
            }

            /**
             * Ruft den Wert der title-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTitle() {
                return title;
            }

            /**
             * Legt den Wert der title-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTitle(String value) {
                this.title = value;
            }

            /**
             * Ruft den Wert der type-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Legt den Wert der type-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }

            /**
             * Ruft den Wert der status-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStatus() {
                return status;
            }

            /**
             * Legt den Wert der status-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStatus(String value) {
                this.status = value;
            }

            /**
             * Ruft den Wert der note-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNote() {
                return note;
            }

            /**
             * Legt den Wert der note-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNote(String value) {
                this.note = value;
            }

            /**
             * Ruft den Wert der confidenceScore-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getConfidenceScore() {
                return confidenceScore;
            }

            /**
             * Legt den Wert der confidenceScore-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setConfidenceScore(String value) {
                this.confidenceScore = value;
            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="Pronunciation" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;attGroup ref="{}attlist.Pronunciation"/&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="Tag" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;attGroup ref="{}attlist.Tag"/&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *       &lt;attGroup ref="{}attlist.Form"/&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "pronunciations",
                "tags"
            })
            public static class Form {

                @XmlElement(name = "Pronunciation")
                protected List<LexicalResource.Lexicon.LexicalEntry.Form.Pronunciation> pronunciations;
                @XmlElement(name = "Tag")
                protected List<LexicalResource.Lexicon.LexicalEntry.Form.Tag> tags;
                @XmlAttribute(name = "id")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlID
                @XmlSchemaType(name = "ID")
                protected String id;
                @XmlAttribute(name = "writtenForm", required = true)
                @XmlSchemaType(name = "anySimpleType")
                protected String writtenForm;
                @XmlAttribute(name = "script")
                @XmlSchemaType(name = "anySimpleType")
                protected String script;

                /**
                 * Gets the value of the pronunciations property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the pronunciations property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPronunciations().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link LexicalResource.Lexicon.LexicalEntry.Form.Pronunciation }
                 * 
                 * 
                 */
                public List<LexicalResource.Lexicon.LexicalEntry.Form.Pronunciation> getPronunciations() {
                    if (pronunciations == null) {
                        pronunciations = new ArrayList<LexicalResource.Lexicon.LexicalEntry.Form.Pronunciation>();
                    }
                    return this.pronunciations;
                }

                /**
                 * Gets the value of the tags property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the tags property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getTags().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link LexicalResource.Lexicon.LexicalEntry.Form.Tag }
                 * 
                 * 
                 */
                public List<LexicalResource.Lexicon.LexicalEntry.Form.Tag> getTags() {
                    if (tags == null) {
                        tags = new ArrayList<LexicalResource.Lexicon.LexicalEntry.Form.Tag>();
                    }
                    return this.tags;
                }

                /**
                 * Ruft den Wert der id-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getId() {
                    return id;
                }

                /**
                 * Legt den Wert der id-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setId(String value) {
                    this.id = value;
                }

                /**
                 * Ruft den Wert der writtenForm-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getWrittenForm() {
                    return writtenForm;
                }

                /**
                 * Legt den Wert der writtenForm-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setWrittenForm(String value) {
                    this.writtenForm = value;
                }

                /**
                 * Ruft den Wert der script-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getScript() {
                    return script;
                }

                /**
                 * Legt den Wert der script-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setScript(String value) {
                    this.script = value;
                }


                /**
                 * <p>Java-Klasse für anonymous complex type.
                 * 
                 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;attGroup ref="{}attlist.Pronunciation"/&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "content"
                })
                public static class Pronunciation {

                    @XmlValue
                    protected String content;
                    @XmlAttribute(name = "variety")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String variety;
                    @XmlAttribute(name = "notation")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String notation;
                    @XmlAttribute(name = "phonemic")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    protected String phonemic;
                    @XmlAttribute(name = "audio")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String audio;

                    /**
                     * Ruft den Wert der content-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getContent() {
                        return content;
                    }

                    /**
                     * Legt den Wert der content-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setContent(String value) {
                        this.content = value;
                    }

                    /**
                     * Ruft den Wert der variety-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getVariety() {
                        return variety;
                    }

                    /**
                     * Legt den Wert der variety-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setVariety(String value) {
                        this.variety = value;
                    }

                    /**
                     * Ruft den Wert der notation-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNotation() {
                        return notation;
                    }

                    /**
                     * Legt den Wert der notation-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNotation(String value) {
                        this.notation = value;
                    }

                    /**
                     * Ruft den Wert der phonemic-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPhonemic() {
                        if (phonemic == null) {
                            return "true";
                        } else {
                            return phonemic;
                        }
                    }

                    /**
                     * Legt den Wert der phonemic-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPhonemic(String value) {
                        this.phonemic = value;
                    }

                    /**
                     * Ruft den Wert der audio-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAudio() {
                        return audio;
                    }

                    /**
                     * Legt den Wert der audio-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAudio(String value) {
                        this.audio = value;
                    }

                }


                /**
                 * <p>Java-Klasse für anonymous complex type.
                 * 
                 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;attGroup ref="{}attlist.Tag"/&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "content"
                })
                public static class Tag {

                    @XmlValue
                    protected String content;
                    @XmlAttribute(name = "category", required = true)
                    @XmlSchemaType(name = "anySimpleType")
                    protected String category;

                    /**
                     * Ruft den Wert der content-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getContent() {
                        return content;
                    }

                    /**
                     * Legt den Wert der content-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setContent(String value) {
                        this.content = value;
                    }

                    /**
                     * Ruft den Wert der category-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCategory() {
                        return category;
                    }

                    /**
                     * Legt den Wert der category-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCategory(String value) {
                        this.category = value;
                    }

                }

            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="Pronunciation" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;attGroup ref="{}attlist.Pronunciation"/&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="Tag" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;attGroup ref="{}attlist.Tag"/&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *       &lt;attGroup ref="{}attlist.Lemma"/&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "pronunciations",
                "tags"
            })
            public static class Lemma {

                @XmlElement(name = "Pronunciation")
                protected List<LexicalResource.Lexicon.LexicalEntry.Lemma.Pronunciation> pronunciations;
                @XmlElement(name = "Tag")
                protected List<LexicalResource.Lexicon.LexicalEntry.Lemma.Tag> tags;
                @XmlAttribute(name = "writtenForm", required = true)
                @XmlSchemaType(name = "anySimpleType")
                protected String writtenForm;
                @XmlAttribute(name = "script")
                @XmlSchemaType(name = "anySimpleType")
                protected String script;
                @XmlAttribute(name = "partOfSpeech", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String partOfSpeech;

                /**
                 * Gets the value of the pronunciations property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the pronunciations property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPronunciations().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link LexicalResource.Lexicon.LexicalEntry.Lemma.Pronunciation }
                 * 
                 * 
                 */
                public List<LexicalResource.Lexicon.LexicalEntry.Lemma.Pronunciation> getPronunciations() {
                    if (pronunciations == null) {
                        pronunciations = new ArrayList<LexicalResource.Lexicon.LexicalEntry.Lemma.Pronunciation>();
                    }
                    return this.pronunciations;
                }

                /**
                 * Gets the value of the tags property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the tags property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getTags().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link LexicalResource.Lexicon.LexicalEntry.Lemma.Tag }
                 * 
                 * 
                 */
                public List<LexicalResource.Lexicon.LexicalEntry.Lemma.Tag> getTags() {
                    if (tags == null) {
                        tags = new ArrayList<LexicalResource.Lexicon.LexicalEntry.Lemma.Tag>();
                    }
                    return this.tags;
                }

                /**
                 * Ruft den Wert der writtenForm-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getWrittenForm() {
                    return writtenForm;
                }

                /**
                 * Legt den Wert der writtenForm-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setWrittenForm(String value) {
                    this.writtenForm = value;
                }

                /**
                 * Ruft den Wert der script-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getScript() {
                    return script;
                }

                /**
                 * Legt den Wert der script-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setScript(String value) {
                    this.script = value;
                }

                /**
                 * Ruft den Wert der partOfSpeech-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPartOfSpeech() {
                    return partOfSpeech;
                }

                /**
                 * Legt den Wert der partOfSpeech-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPartOfSpeech(String value) {
                    this.partOfSpeech = value;
                }


                /**
                 * <p>Java-Klasse für anonymous complex type.
                 * 
                 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;attGroup ref="{}attlist.Pronunciation"/&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "content"
                })
                public static class Pronunciation {

                    @XmlValue
                    protected String content;
                    @XmlAttribute(name = "variety")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String variety;
                    @XmlAttribute(name = "notation")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String notation;
                    @XmlAttribute(name = "phonemic")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    protected String phonemic;
                    @XmlAttribute(name = "audio")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String audio;

                    /**
                     * Ruft den Wert der content-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getContent() {
                        return content;
                    }

                    /**
                     * Legt den Wert der content-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setContent(String value) {
                        this.content = value;
                    }

                    /**
                     * Ruft den Wert der variety-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getVariety() {
                        return variety;
                    }

                    /**
                     * Legt den Wert der variety-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setVariety(String value) {
                        this.variety = value;
                    }

                    /**
                     * Ruft den Wert der notation-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNotation() {
                        return notation;
                    }

                    /**
                     * Legt den Wert der notation-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNotation(String value) {
                        this.notation = value;
                    }

                    /**
                     * Ruft den Wert der phonemic-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPhonemic() {
                        if (phonemic == null) {
                            return "true";
                        } else {
                            return phonemic;
                        }
                    }

                    /**
                     * Legt den Wert der phonemic-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPhonemic(String value) {
                        this.phonemic = value;
                    }

                    /**
                     * Ruft den Wert der audio-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAudio() {
                        return audio;
                    }

                    /**
                     * Legt den Wert der audio-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAudio(String value) {
                        this.audio = value;
                    }

                }


                /**
                 * <p>Java-Klasse für anonymous complex type.
                 * 
                 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;attGroup ref="{}attlist.Tag"/&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "content"
                })
                public static class Tag {

                    @XmlValue
                    protected String content;
                    @XmlAttribute(name = "category", required = true)
                    @XmlSchemaType(name = "anySimpleType")
                    protected String category;

                    /**
                     * Ruft den Wert der content-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getContent() {
                        return content;
                    }

                    /**
                     * Legt den Wert der content-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setContent(String value) {
                        this.content = value;
                    }

                    /**
                     * Ruft den Wert der category-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCategory() {
                        return category;
                    }

                    /**
                     * Legt den Wert der category-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCategory(String value) {
                        this.category = value;
                    }

                }

            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="SenseRelation" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;attGroup ref="{}attlist.SenseRelation"/&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="Example" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;attGroup ref="{}attlist.Example"/&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="Count" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;attGroup ref="{}attlist.Count"/&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *       &lt;attGroup ref="{}attlist.Sense"/&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "senseRelations",
                "examples",
                "counts"
            })
            public static class Sense {

                @XmlElement(name = "SenseRelation")
                protected List<LexicalResource.Lexicon.LexicalEntry.Sense.SenseRelation> senseRelations;
                @XmlElement(name = "Example")
                protected List<LexicalResource.Lexicon.LexicalEntry.Sense.Example> examples;
                @XmlElement(name = "Count")
                protected List<LexicalResource.Lexicon.LexicalEntry.Sense.Count> counts;
                @XmlAttribute(name = "id", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlID
                @XmlSchemaType(name = "ID")
                protected String id;
                @XmlAttribute(name = "synset", required = true)
                @XmlIDREF
                @XmlSchemaType(name = "IDREF")
                protected Object synset;
                @XmlAttribute(name = "contributor", namespace = "https://globalwordnet.github.io/schemas/dc/")
                @XmlSchemaType(name = "anySimpleType")
                protected String contributor;
                @XmlAttribute(name = "coverage", namespace = "https://globalwordnet.github.io/schemas/dc/")
                @XmlSchemaType(name = "anySimpleType")
                protected String coverage;
                @XmlAttribute(name = "creator", namespace = "https://globalwordnet.github.io/schemas/dc/")
                @XmlSchemaType(name = "anySimpleType")
                protected String creator;
                @XmlAttribute(name = "date", namespace = "https://globalwordnet.github.io/schemas/dc/")
                @XmlSchemaType(name = "anySimpleType")
                protected String date;
                @XmlAttribute(name = "description", namespace = "https://globalwordnet.github.io/schemas/dc/")
                @XmlSchemaType(name = "anySimpleType")
                protected String description;
                @XmlAttribute(name = "format", namespace = "https://globalwordnet.github.io/schemas/dc/")
                @XmlSchemaType(name = "anySimpleType")
                protected String format;
                @XmlAttribute(name = "identifier", namespace = "https://globalwordnet.github.io/schemas/dc/")
                @XmlSchemaType(name = "anySimpleType")
                protected String identifier;
                @XmlAttribute(name = "publisher", namespace = "https://globalwordnet.github.io/schemas/dc/")
                @XmlSchemaType(name = "anySimpleType")
                protected String publisher;
                @XmlAttribute(name = "relation", namespace = "https://globalwordnet.github.io/schemas/dc/")
                @XmlSchemaType(name = "anySimpleType")
                protected String relation;
                @XmlAttribute(name = "rights", namespace = "https://globalwordnet.github.io/schemas/dc/")
                @XmlSchemaType(name = "anySimpleType")
                protected String rights;
                @XmlAttribute(name = "source", namespace = "https://globalwordnet.github.io/schemas/dc/")
                @XmlSchemaType(name = "anySimpleType")
                protected String source;
                @XmlAttribute(name = "subject", namespace = "https://globalwordnet.github.io/schemas/dc/")
                @XmlSchemaType(name = "anySimpleType")
                protected String subject;
                @XmlAttribute(name = "title", namespace = "https://globalwordnet.github.io/schemas/dc/")
                @XmlSchemaType(name = "anySimpleType")
                protected String title;
                @XmlAttribute(name = "type", namespace = "https://globalwordnet.github.io/schemas/dc/")
                @XmlSchemaType(name = "anySimpleType")
                protected String type;
                @XmlAttribute(name = "status")
                @XmlSchemaType(name = "anySimpleType")
                protected String status;
                @XmlAttribute(name = "note")
                @XmlSchemaType(name = "anySimpleType")
                protected String note;
                @XmlAttribute(name = "confidenceScore")
                @XmlSchemaType(name = "anySimpleType")
                protected String confidenceScore;
                @XmlAttribute(name = "lexicalized")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String lexicalized;
                @XmlAttribute(name = "adjposition")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String adjposition;
                @XmlAttribute(name = "subcat")
                @XmlIDREF
                @XmlSchemaType(name = "IDREFS")
                protected List<Object> subcats;

                /**
                 * Gets the value of the senseRelations property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the senseRelations property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSenseRelations().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link LexicalResource.Lexicon.LexicalEntry.Sense.SenseRelation }
                 * 
                 * 
                 */
                public List<LexicalResource.Lexicon.LexicalEntry.Sense.SenseRelation> getSenseRelations() {
                    if (senseRelations == null) {
                        senseRelations = new ArrayList<LexicalResource.Lexicon.LexicalEntry.Sense.SenseRelation>();
                    }
                    return this.senseRelations;
                }

                /**
                 * Gets the value of the examples property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the examples property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getExamples().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link LexicalResource.Lexicon.LexicalEntry.Sense.Example }
                 * 
                 * 
                 */
                public List<LexicalResource.Lexicon.LexicalEntry.Sense.Example> getExamples() {
                    if (examples == null) {
                        examples = new ArrayList<LexicalResource.Lexicon.LexicalEntry.Sense.Example>();
                    }
                    return this.examples;
                }

                /**
                 * Gets the value of the counts property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the counts property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getCounts().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link LexicalResource.Lexicon.LexicalEntry.Sense.Count }
                 * 
                 * 
                 */
                public List<LexicalResource.Lexicon.LexicalEntry.Sense.Count> getCounts() {
                    if (counts == null) {
                        counts = new ArrayList<LexicalResource.Lexicon.LexicalEntry.Sense.Count>();
                    }
                    return this.counts;
                }

                /**
                 * Ruft den Wert der id-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getId() {
                    return id;
                }

                /**
                 * Legt den Wert der id-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setId(String value) {
                    this.id = value;
                }

                /**
                 * Ruft den Wert der synset-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getSynset() {
                    return synset;
                }

                /**
                 * Legt den Wert der synset-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setSynset(Object value) {
                    this.synset = value;
                }

                /**
                 * Ruft den Wert der contributor-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getContributor() {
                    return contributor;
                }

                /**
                 * Legt den Wert der contributor-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setContributor(String value) {
                    this.contributor = value;
                }

                /**
                 * Ruft den Wert der coverage-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCoverage() {
                    return coverage;
                }

                /**
                 * Legt den Wert der coverage-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCoverage(String value) {
                    this.coverage = value;
                }

                /**
                 * Ruft den Wert der creator-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCreator() {
                    return creator;
                }

                /**
                 * Legt den Wert der creator-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCreator(String value) {
                    this.creator = value;
                }

                /**
                 * Ruft den Wert der date-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDate() {
                    return date;
                }

                /**
                 * Legt den Wert der date-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDate(String value) {
                    this.date = value;
                }

                /**
                 * Ruft den Wert der description-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Legt den Wert der description-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
                }

                /**
                 * Ruft den Wert der format-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFormat() {
                    return format;
                }

                /**
                 * Legt den Wert der format-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFormat(String value) {
                    this.format = value;
                }

                /**
                 * Ruft den Wert der identifier-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIdentifier() {
                    return identifier;
                }

                /**
                 * Legt den Wert der identifier-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIdentifier(String value) {
                    this.identifier = value;
                }

                /**
                 * Ruft den Wert der publisher-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPublisher() {
                    return publisher;
                }

                /**
                 * Legt den Wert der publisher-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPublisher(String value) {
                    this.publisher = value;
                }

                /**
                 * Ruft den Wert der relation-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRelation() {
                    return relation;
                }

                /**
                 * Legt den Wert der relation-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRelation(String value) {
                    this.relation = value;
                }

                /**
                 * Ruft den Wert der rights-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRights() {
                    return rights;
                }

                /**
                 * Legt den Wert der rights-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRights(String value) {
                    this.rights = value;
                }

                /**
                 * Ruft den Wert der source-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSource() {
                    return source;
                }

                /**
                 * Legt den Wert der source-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSource(String value) {
                    this.source = value;
                }

                /**
                 * Ruft den Wert der subject-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSubject() {
                    return subject;
                }

                /**
                 * Legt den Wert der subject-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSubject(String value) {
                    this.subject = value;
                }

                /**
                 * Ruft den Wert der title-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTitle() {
                    return title;
                }

                /**
                 * Legt den Wert der title-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTitle(String value) {
                    this.title = value;
                }

                /**
                 * Ruft den Wert der type-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getType() {
                    return type;
                }

                /**
                 * Legt den Wert der type-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setType(String value) {
                    this.type = value;
                }

                /**
                 * Ruft den Wert der status-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStatus() {
                    return status;
                }

                /**
                 * Legt den Wert der status-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStatus(String value) {
                    this.status = value;
                }

                /**
                 * Ruft den Wert der note-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNote() {
                    return note;
                }

                /**
                 * Legt den Wert der note-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNote(String value) {
                    this.note = value;
                }

                /**
                 * Ruft den Wert der confidenceScore-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getConfidenceScore() {
                    return confidenceScore;
                }

                /**
                 * Legt den Wert der confidenceScore-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setConfidenceScore(String value) {
                    this.confidenceScore = value;
                }

                /**
                 * Ruft den Wert der lexicalized-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLexicalized() {
                    if (lexicalized == null) {
                        return "true";
                    } else {
                        return lexicalized;
                    }
                }

                /**
                 * Legt den Wert der lexicalized-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLexicalized(String value) {
                    this.lexicalized = value;
                }

                /**
                 * Ruft den Wert der adjposition-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAdjposition() {
                    return adjposition;
                }

                /**
                 * Legt den Wert der adjposition-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAdjposition(String value) {
                    this.adjposition = value;
                }

                /**
                 * Gets the value of the subcats property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the subcats property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSubcats().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Object }
                 * 
                 * 
                 */
                public List<Object> getSubcats() {
                    if (subcats == null) {
                        subcats = new ArrayList<Object>();
                    }
                    return this.subcats;
                }


                /**
                 * <p>Java-Klasse für anonymous complex type.
                 * 
                 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;attGroup ref="{}attlist.Count"/&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "content"
                })
                public static class Count {

                    @XmlValue
                    protected String content;
                    @XmlAttribute(name = "contributor", namespace = "https://globalwordnet.github.io/schemas/dc/")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String contributor;
                    @XmlAttribute(name = "coverage", namespace = "https://globalwordnet.github.io/schemas/dc/")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String coverage;
                    @XmlAttribute(name = "creator", namespace = "https://globalwordnet.github.io/schemas/dc/")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String creator;
                    @XmlAttribute(name = "date", namespace = "https://globalwordnet.github.io/schemas/dc/")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String date;
                    @XmlAttribute(name = "description", namespace = "https://globalwordnet.github.io/schemas/dc/")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String description;
                    @XmlAttribute(name = "format", namespace = "https://globalwordnet.github.io/schemas/dc/")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String format;
                    @XmlAttribute(name = "identifier", namespace = "https://globalwordnet.github.io/schemas/dc/")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String identifier;
                    @XmlAttribute(name = "publisher", namespace = "https://globalwordnet.github.io/schemas/dc/")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String publisher;
                    @XmlAttribute(name = "relation", namespace = "https://globalwordnet.github.io/schemas/dc/")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String relation;
                    @XmlAttribute(name = "rights", namespace = "https://globalwordnet.github.io/schemas/dc/")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String rights;
                    @XmlAttribute(name = "source", namespace = "https://globalwordnet.github.io/schemas/dc/")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String source;
                    @XmlAttribute(name = "subject", namespace = "https://globalwordnet.github.io/schemas/dc/")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String subject;
                    @XmlAttribute(name = "title", namespace = "https://globalwordnet.github.io/schemas/dc/")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String title;
                    @XmlAttribute(name = "type", namespace = "https://globalwordnet.github.io/schemas/dc/")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String type;
                    @XmlAttribute(name = "status")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String status;
                    @XmlAttribute(name = "note")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String note;
                    @XmlAttribute(name = "confidenceScore")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String confidenceScore;

                    /**
                     * Ruft den Wert der content-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getContent() {
                        return content;
                    }

                    /**
                     * Legt den Wert der content-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setContent(String value) {
                        this.content = value;
                    }

                    /**
                     * Ruft den Wert der contributor-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getContributor() {
                        return contributor;
                    }

                    /**
                     * Legt den Wert der contributor-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setContributor(String value) {
                        this.contributor = value;
                    }

                    /**
                     * Ruft den Wert der coverage-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCoverage() {
                        return coverage;
                    }

                    /**
                     * Legt den Wert der coverage-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCoverage(String value) {
                        this.coverage = value;
                    }

                    /**
                     * Ruft den Wert der creator-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCreator() {
                        return creator;
                    }

                    /**
                     * Legt den Wert der creator-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCreator(String value) {
                        this.creator = value;
                    }

                    /**
                     * Ruft den Wert der date-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDate() {
                        return date;
                    }

                    /**
                     * Legt den Wert der date-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDate(String value) {
                        this.date = value;
                    }

                    /**
                     * Ruft den Wert der description-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDescription() {
                        return description;
                    }

                    /**
                     * Legt den Wert der description-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDescription(String value) {
                        this.description = value;
                    }

                    /**
                     * Ruft den Wert der format-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFormat() {
                        return format;
                    }

                    /**
                     * Legt den Wert der format-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFormat(String value) {
                        this.format = value;
                    }

                    /**
                     * Ruft den Wert der identifier-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getIdentifier() {
                        return identifier;
                    }

                    /**
                     * Legt den Wert der identifier-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setIdentifier(String value) {
                        this.identifier = value;
                    }

                    /**
                     * Ruft den Wert der publisher-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPublisher() {
                        return publisher;
                    }

                    /**
                     * Legt den Wert der publisher-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPublisher(String value) {
                        this.publisher = value;
                    }

                    /**
                     * Ruft den Wert der relation-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRelation() {
                        return relation;
                    }

                    /**
                     * Legt den Wert der relation-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRelation(String value) {
                        this.relation = value;
                    }

                    /**
                     * Ruft den Wert der rights-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRights() {
                        return rights;
                    }

                    /**
                     * Legt den Wert der rights-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRights(String value) {
                        this.rights = value;
                    }

                    /**
                     * Ruft den Wert der source-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSource() {
                        return source;
                    }

                    /**
                     * Legt den Wert der source-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSource(String value) {
                        this.source = value;
                    }

                    /**
                     * Ruft den Wert der subject-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSubject() {
                        return subject;
                    }

                    /**
                     * Legt den Wert der subject-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSubject(String value) {
                        this.subject = value;
                    }

                    /**
                     * Ruft den Wert der title-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTitle() {
                        return title;
                    }

                    /**
                     * Legt den Wert der title-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTitle(String value) {
                        this.title = value;
                    }

                    /**
                     * Ruft den Wert der type-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getType() {
                        return type;
                    }

                    /**
                     * Legt den Wert der type-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setType(String value) {
                        this.type = value;
                    }

                    /**
                     * Ruft den Wert der status-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getStatus() {
                        return status;
                    }

                    /**
                     * Legt den Wert der status-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setStatus(String value) {
                        this.status = value;
                    }

                    /**
                     * Ruft den Wert der note-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNote() {
                        return note;
                    }

                    /**
                     * Legt den Wert der note-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNote(String value) {
                        this.note = value;
                    }

                    /**
                     * Ruft den Wert der confidenceScore-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getConfidenceScore() {
                        return confidenceScore;
                    }

                    /**
                     * Legt den Wert der confidenceScore-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setConfidenceScore(String value) {
                        this.confidenceScore = value;
                    }

                }


                /**
                 * <p>Java-Klasse für anonymous complex type.
                 * 
                 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;attGroup ref="{}attlist.Example"/&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "content"
                })
                public static class Example {

                    @XmlValue
                    protected String content;
                    @XmlAttribute(name = "language")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String language;
                    @XmlAttribute(name = "contributor", namespace = "https://globalwordnet.github.io/schemas/dc/")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String contributor;
                    @XmlAttribute(name = "coverage", namespace = "https://globalwordnet.github.io/schemas/dc/")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String coverage;
                    @XmlAttribute(name = "creator", namespace = "https://globalwordnet.github.io/schemas/dc/")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String creator;
                    @XmlAttribute(name = "date", namespace = "https://globalwordnet.github.io/schemas/dc/")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String date;
                    @XmlAttribute(name = "description", namespace = "https://globalwordnet.github.io/schemas/dc/")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String description;
                    @XmlAttribute(name = "format", namespace = "https://globalwordnet.github.io/schemas/dc/")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String format;
                    @XmlAttribute(name = "identifier", namespace = "https://globalwordnet.github.io/schemas/dc/")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String identifier;
                    @XmlAttribute(name = "publisher", namespace = "https://globalwordnet.github.io/schemas/dc/")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String publisher;
                    @XmlAttribute(name = "relation", namespace = "https://globalwordnet.github.io/schemas/dc/")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String relation;
                    @XmlAttribute(name = "rights", namespace = "https://globalwordnet.github.io/schemas/dc/")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String rights;
                    @XmlAttribute(name = "source", namespace = "https://globalwordnet.github.io/schemas/dc/")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String source;
                    @XmlAttribute(name = "subject", namespace = "https://globalwordnet.github.io/schemas/dc/")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String subject;
                    @XmlAttribute(name = "title", namespace = "https://globalwordnet.github.io/schemas/dc/")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String title;
                    @XmlAttribute(name = "type", namespace = "https://globalwordnet.github.io/schemas/dc/")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String type;
                    @XmlAttribute(name = "status")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String status;
                    @XmlAttribute(name = "note")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String note;
                    @XmlAttribute(name = "confidenceScore")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String confidenceScore;

                    /**
                     * Ruft den Wert der content-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getContent() {
                        return content;
                    }

                    /**
                     * Legt den Wert der content-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setContent(String value) {
                        this.content = value;
                    }

                    /**
                     * Ruft den Wert der language-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getLanguage() {
                        return language;
                    }

                    /**
                     * Legt den Wert der language-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setLanguage(String value) {
                        this.language = value;
                    }

                    /**
                     * Ruft den Wert der contributor-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getContributor() {
                        return contributor;
                    }

                    /**
                     * Legt den Wert der contributor-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setContributor(String value) {
                        this.contributor = value;
                    }

                    /**
                     * Ruft den Wert der coverage-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCoverage() {
                        return coverage;
                    }

                    /**
                     * Legt den Wert der coverage-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCoverage(String value) {
                        this.coverage = value;
                    }

                    /**
                     * Ruft den Wert der creator-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCreator() {
                        return creator;
                    }

                    /**
                     * Legt den Wert der creator-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCreator(String value) {
                        this.creator = value;
                    }

                    /**
                     * Ruft den Wert der date-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDate() {
                        return date;
                    }

                    /**
                     * Legt den Wert der date-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDate(String value) {
                        this.date = value;
                    }

                    /**
                     * Ruft den Wert der description-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDescription() {
                        return description;
                    }

                    /**
                     * Legt den Wert der description-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDescription(String value) {
                        this.description = value;
                    }

                    /**
                     * Ruft den Wert der format-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFormat() {
                        return format;
                    }

                    /**
                     * Legt den Wert der format-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFormat(String value) {
                        this.format = value;
                    }

                    /**
                     * Ruft den Wert der identifier-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getIdentifier() {
                        return identifier;
                    }

                    /**
                     * Legt den Wert der identifier-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setIdentifier(String value) {
                        this.identifier = value;
                    }

                    /**
                     * Ruft den Wert der publisher-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPublisher() {
                        return publisher;
                    }

                    /**
                     * Legt den Wert der publisher-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPublisher(String value) {
                        this.publisher = value;
                    }

                    /**
                     * Ruft den Wert der relation-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRelation() {
                        return relation;
                    }

                    /**
                     * Legt den Wert der relation-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRelation(String value) {
                        this.relation = value;
                    }

                    /**
                     * Ruft den Wert der rights-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRights() {
                        return rights;
                    }

                    /**
                     * Legt den Wert der rights-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRights(String value) {
                        this.rights = value;
                    }

                    /**
                     * Ruft den Wert der source-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSource() {
                        return source;
                    }

                    /**
                     * Legt den Wert der source-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSource(String value) {
                        this.source = value;
                    }

                    /**
                     * Ruft den Wert der subject-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSubject() {
                        return subject;
                    }

                    /**
                     * Legt den Wert der subject-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSubject(String value) {
                        this.subject = value;
                    }

                    /**
                     * Ruft den Wert der title-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTitle() {
                        return title;
                    }

                    /**
                     * Legt den Wert der title-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTitle(String value) {
                        this.title = value;
                    }

                    /**
                     * Ruft den Wert der type-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getType() {
                        return type;
                    }

                    /**
                     * Legt den Wert der type-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setType(String value) {
                        this.type = value;
                    }

                    /**
                     * Ruft den Wert der status-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getStatus() {
                        return status;
                    }

                    /**
                     * Legt den Wert der status-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setStatus(String value) {
                        this.status = value;
                    }

                    /**
                     * Ruft den Wert der note-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNote() {
                        return note;
                    }

                    /**
                     * Legt den Wert der note-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNote(String value) {
                        this.note = value;
                    }

                    /**
                     * Ruft den Wert der confidenceScore-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getConfidenceScore() {
                        return confidenceScore;
                    }

                    /**
                     * Legt den Wert der confidenceScore-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setConfidenceScore(String value) {
                        this.confidenceScore = value;
                    }

                }


                /**
                 * <p>Java-Klasse für anonymous complex type.
                 * 
                 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;attGroup ref="{}attlist.SenseRelation"/&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class SenseRelation {

                    @XmlAttribute(name = "target", required = true)
                    @XmlIDREF
                    @XmlSchemaType(name = "IDREF")
                    protected Object target;
                    @XmlAttribute(name = "relType", required = true)
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    protected String relType;
                    @XmlAttribute(name = "contributor", namespace = "https://globalwordnet.github.io/schemas/dc/")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String contributor;
                    @XmlAttribute(name = "coverage", namespace = "https://globalwordnet.github.io/schemas/dc/")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String coverage;
                    @XmlAttribute(name = "creator", namespace = "https://globalwordnet.github.io/schemas/dc/")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String creator;
                    @XmlAttribute(name = "date", namespace = "https://globalwordnet.github.io/schemas/dc/")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String date;
                    @XmlAttribute(name = "description", namespace = "https://globalwordnet.github.io/schemas/dc/")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String description;
                    @XmlAttribute(name = "format", namespace = "https://globalwordnet.github.io/schemas/dc/")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String format;
                    @XmlAttribute(name = "identifier", namespace = "https://globalwordnet.github.io/schemas/dc/")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String identifier;
                    @XmlAttribute(name = "publisher", namespace = "https://globalwordnet.github.io/schemas/dc/")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String publisher;
                    @XmlAttribute(name = "relation", namespace = "https://globalwordnet.github.io/schemas/dc/")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String relation;
                    @XmlAttribute(name = "rights", namespace = "https://globalwordnet.github.io/schemas/dc/")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String rights;
                    @XmlAttribute(name = "source", namespace = "https://globalwordnet.github.io/schemas/dc/")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String source;
                    @XmlAttribute(name = "subject", namespace = "https://globalwordnet.github.io/schemas/dc/")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String subject;
                    @XmlAttribute(name = "title", namespace = "https://globalwordnet.github.io/schemas/dc/")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String title;
                    @XmlAttribute(name = "type", namespace = "https://globalwordnet.github.io/schemas/dc/")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String type;
                    @XmlAttribute(name = "status")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String status;
                    @XmlAttribute(name = "note")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String note;
                    @XmlAttribute(name = "confidenceScore")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String confidenceScore;

                    /**
                     * Ruft den Wert der target-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Object }
                     *     
                     */
                    public Object getTarget() {
                        return target;
                    }

                    /**
                     * Legt den Wert der target-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Object }
                     *     
                     */
                    public void setTarget(Object value) {
                        this.target = value;
                    }

                    /**
                     * Ruft den Wert der relType-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRelType() {
                        return relType;
                    }

                    /**
                     * Legt den Wert der relType-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRelType(String value) {
                        this.relType = value;
                    }

                    /**
                     * Ruft den Wert der contributor-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getContributor() {
                        return contributor;
                    }

                    /**
                     * Legt den Wert der contributor-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setContributor(String value) {
                        this.contributor = value;
                    }

                    /**
                     * Ruft den Wert der coverage-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCoverage() {
                        return coverage;
                    }

                    /**
                     * Legt den Wert der coverage-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCoverage(String value) {
                        this.coverage = value;
                    }

                    /**
                     * Ruft den Wert der creator-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCreator() {
                        return creator;
                    }

                    /**
                     * Legt den Wert der creator-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCreator(String value) {
                        this.creator = value;
                    }

                    /**
                     * Ruft den Wert der date-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDate() {
                        return date;
                    }

                    /**
                     * Legt den Wert der date-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDate(String value) {
                        this.date = value;
                    }

                    /**
                     * Ruft den Wert der description-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDescription() {
                        return description;
                    }

                    /**
                     * Legt den Wert der description-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDescription(String value) {
                        this.description = value;
                    }

                    /**
                     * Ruft den Wert der format-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFormat() {
                        return format;
                    }

                    /**
                     * Legt den Wert der format-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFormat(String value) {
                        this.format = value;
                    }

                    /**
                     * Ruft den Wert der identifier-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getIdentifier() {
                        return identifier;
                    }

                    /**
                     * Legt den Wert der identifier-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setIdentifier(String value) {
                        this.identifier = value;
                    }

                    /**
                     * Ruft den Wert der publisher-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPublisher() {
                        return publisher;
                    }

                    /**
                     * Legt den Wert der publisher-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPublisher(String value) {
                        this.publisher = value;
                    }

                    /**
                     * Ruft den Wert der relation-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRelation() {
                        return relation;
                    }

                    /**
                     * Legt den Wert der relation-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRelation(String value) {
                        this.relation = value;
                    }

                    /**
                     * Ruft den Wert der rights-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRights() {
                        return rights;
                    }

                    /**
                     * Legt den Wert der rights-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRights(String value) {
                        this.rights = value;
                    }

                    /**
                     * Ruft den Wert der source-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSource() {
                        return source;
                    }

                    /**
                     * Legt den Wert der source-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSource(String value) {
                        this.source = value;
                    }

                    /**
                     * Ruft den Wert der subject-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSubject() {
                        return subject;
                    }

                    /**
                     * Legt den Wert der subject-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSubject(String value) {
                        this.subject = value;
                    }

                    /**
                     * Ruft den Wert der title-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTitle() {
                        return title;
                    }

                    /**
                     * Legt den Wert der title-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTitle(String value) {
                        this.title = value;
                    }

                    /**
                     * Ruft den Wert der type-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getType() {
                        return type;
                    }

                    /**
                     * Legt den Wert der type-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setType(String value) {
                        this.type = value;
                    }

                    /**
                     * Ruft den Wert der status-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getStatus() {
                        return status;
                    }

                    /**
                     * Legt den Wert der status-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setStatus(String value) {
                        this.status = value;
                    }

                    /**
                     * Ruft den Wert der note-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNote() {
                        return note;
                    }

                    /**
                     * Legt den Wert der note-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNote(String value) {
                        this.note = value;
                    }

                    /**
                     * Ruft den Wert der confidenceScore-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getConfidenceScore() {
                        return confidenceScore;
                    }

                    /**
                     * Legt den Wert der confidenceScore-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setConfidenceScore(String value) {
                        this.confidenceScore = value;
                    }

                }

            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;attGroup ref="{}attlist.SyntacticBehaviour"/&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class SyntacticBehaviour {

                @XmlAttribute(name = "id")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlID
                @XmlSchemaType(name = "ID")
                protected String id;
                @XmlAttribute(name = "subcategorizationFrame", required = true)
                @XmlSchemaType(name = "anySimpleType")
                protected String subcategorizationFrame;
                @XmlAttribute(name = "senses")
                @XmlIDREF
                @XmlSchemaType(name = "IDREFS")
                protected List<Object> senses;

                /**
                 * Ruft den Wert der id-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getId() {
                    return id;
                }

                /**
                 * Legt den Wert der id-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setId(String value) {
                    this.id = value;
                }

                /**
                 * Ruft den Wert der subcategorizationFrame-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSubcategorizationFrame() {
                    return subcategorizationFrame;
                }

                /**
                 * Legt den Wert der subcategorizationFrame-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSubcategorizationFrame(String value) {
                    this.subcategorizationFrame = value;
                }

                /**
                 * Gets the value of the senses property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the senses property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSenses().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Object }
                 * 
                 * 
                 */
                public List<Object> getSenses() {
                    if (senses == null) {
                        senses = new ArrayList<Object>();
                    }
                    return this.senses;
                }

            }

        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="Definition" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attGroup ref="{}attlist.Definition"/&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="SynsetRelation" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attGroup ref="{}attlist.SynsetRelation"/&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Example" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attGroup ref="{}attlist.Example"/&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attGroup ref="{}attlist.Synset"/&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "definitions",
            "synsetRelations",
            "examples"
        })
        public static class Synset {

            @XmlElement(name = "Definition")
            protected List<LexicalResource.Lexicon.Synset.Definition> definitions;
            @XmlElement(name = "SynsetRelation")
            protected List<LexicalResource.Lexicon.Synset.SynsetRelation> synsetRelations;
            @XmlElement(name = "Example")
            protected List<LexicalResource.Lexicon.Synset.Example> examples;
            @XmlAttribute(name = "id", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String id;
            @XmlAttribute(name = "ili", required = true)
            @XmlSchemaType(name = "anySimpleType")
            protected String ili;
            @XmlAttribute(name = "partOfSpeech")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String partOfSpeech;
            @XmlAttribute(name = "contributor", namespace = "https://globalwordnet.github.io/schemas/dc/")
            @XmlSchemaType(name = "anySimpleType")
            protected String contributor;
            @XmlAttribute(name = "coverage", namespace = "https://globalwordnet.github.io/schemas/dc/")
            @XmlSchemaType(name = "anySimpleType")
            protected String coverage;
            @XmlAttribute(name = "creator", namespace = "https://globalwordnet.github.io/schemas/dc/")
            @XmlSchemaType(name = "anySimpleType")
            protected String creator;
            @XmlAttribute(name = "date", namespace = "https://globalwordnet.github.io/schemas/dc/")
            @XmlSchemaType(name = "anySimpleType")
            protected String date;
            @XmlAttribute(name = "description", namespace = "https://globalwordnet.github.io/schemas/dc/")
            @XmlSchemaType(name = "anySimpleType")
            protected String description;
            @XmlAttribute(name = "format", namespace = "https://globalwordnet.github.io/schemas/dc/")
            @XmlSchemaType(name = "anySimpleType")
            protected String format;
            @XmlAttribute(name = "identifier", namespace = "https://globalwordnet.github.io/schemas/dc/")
            @XmlSchemaType(name = "anySimpleType")
            protected String identifier;
            @XmlAttribute(name = "publisher", namespace = "https://globalwordnet.github.io/schemas/dc/")
            @XmlSchemaType(name = "anySimpleType")
            protected String publisher;
            @XmlAttribute(name = "relation", namespace = "https://globalwordnet.github.io/schemas/dc/")
            @XmlSchemaType(name = "anySimpleType")
            protected String relation;
            @XmlAttribute(name = "rights", namespace = "https://globalwordnet.github.io/schemas/dc/")
            @XmlSchemaType(name = "anySimpleType")
            protected String rights;
            @XmlAttribute(name = "source", namespace = "https://globalwordnet.github.io/schemas/dc/")
            @XmlSchemaType(name = "anySimpleType")
            protected String source;
            @XmlAttribute(name = "subject", namespace = "https://globalwordnet.github.io/schemas/dc/")
            @XmlSchemaType(name = "anySimpleType")
            protected String subject;
            @XmlAttribute(name = "title", namespace = "https://globalwordnet.github.io/schemas/dc/")
            @XmlSchemaType(name = "anySimpleType")
            protected String title;
            @XmlAttribute(name = "type", namespace = "https://globalwordnet.github.io/schemas/dc/")
            @XmlSchemaType(name = "anySimpleType")
            protected String type;
            @XmlAttribute(name = "status")
            @XmlSchemaType(name = "anySimpleType")
            protected String status;
            @XmlAttribute(name = "note")
            @XmlSchemaType(name = "anySimpleType")
            protected String note;
            @XmlAttribute(name = "confidenceScore")
            @XmlSchemaType(name = "anySimpleType")
            protected String confidenceScore;
            @XmlAttribute(name = "lexicalized")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String lexicalized;
            @XmlAttribute(name = "members")
            @XmlIDREF
            @XmlSchemaType(name = "IDREFS")
            protected List<Object> members;
            @XmlAttribute(name = "lexfile")
            @XmlSchemaType(name = "anySimpleType")
            protected String lexfile;

            /**
             * Gets the value of the definitions property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the definitions property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDefinitions().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link LexicalResource.Lexicon.Synset.Definition }
             * 
             * 
             */
            public List<LexicalResource.Lexicon.Synset.Definition> getDefinitions() {
                if (definitions == null) {
                    definitions = new ArrayList<LexicalResource.Lexicon.Synset.Definition>();
                }
                return this.definitions;
            }

            /**
             * Gets the value of the synsetRelations property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the synsetRelations property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSynsetRelations().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link LexicalResource.Lexicon.Synset.SynsetRelation }
             * 
             * 
             */
            public List<LexicalResource.Lexicon.Synset.SynsetRelation> getSynsetRelations() {
                if (synsetRelations == null) {
                    synsetRelations = new ArrayList<LexicalResource.Lexicon.Synset.SynsetRelation>();
                }
                return this.synsetRelations;
            }

            /**
             * Gets the value of the examples property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the examples property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getExamples().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link LexicalResource.Lexicon.Synset.Example }
             * 
             * 
             */
            public List<LexicalResource.Lexicon.Synset.Example> getExamples() {
                if (examples == null) {
                    examples = new ArrayList<LexicalResource.Lexicon.Synset.Example>();
                }
                return this.examples;
            }

            /**
             * Ruft den Wert der id-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * Legt den Wert der id-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
            }

            /**
             * Ruft den Wert der ili-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIli() {
                return ili;
            }

            /**
             * Legt den Wert der ili-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIli(String value) {
                this.ili = value;
            }

            /**
             * Ruft den Wert der partOfSpeech-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPartOfSpeech() {
                return partOfSpeech;
            }

            /**
             * Legt den Wert der partOfSpeech-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPartOfSpeech(String value) {
                this.partOfSpeech = value;
            }

            /**
             * Ruft den Wert der contributor-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContributor() {
                return contributor;
            }

            /**
             * Legt den Wert der contributor-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setContributor(String value) {
                this.contributor = value;
            }

            /**
             * Ruft den Wert der coverage-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCoverage() {
                return coverage;
            }

            /**
             * Legt den Wert der coverage-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCoverage(String value) {
                this.coverage = value;
            }

            /**
             * Ruft den Wert der creator-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCreator() {
                return creator;
            }

            /**
             * Legt den Wert der creator-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCreator(String value) {
                this.creator = value;
            }

            /**
             * Ruft den Wert der date-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDate() {
                return date;
            }

            /**
             * Legt den Wert der date-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDate(String value) {
                this.date = value;
            }

            /**
             * Ruft den Wert der description-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescription() {
                return description;
            }

            /**
             * Legt den Wert der description-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescription(String value) {
                this.description = value;
            }

            /**
             * Ruft den Wert der format-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFormat() {
                return format;
            }

            /**
             * Legt den Wert der format-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFormat(String value) {
                this.format = value;
            }

            /**
             * Ruft den Wert der identifier-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIdentifier() {
                return identifier;
            }

            /**
             * Legt den Wert der identifier-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIdentifier(String value) {
                this.identifier = value;
            }

            /**
             * Ruft den Wert der publisher-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPublisher() {
                return publisher;
            }

            /**
             * Legt den Wert der publisher-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPublisher(String value) {
                this.publisher = value;
            }

            /**
             * Ruft den Wert der relation-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRelation() {
                return relation;
            }

            /**
             * Legt den Wert der relation-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRelation(String value) {
                this.relation = value;
            }

            /**
             * Ruft den Wert der rights-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRights() {
                return rights;
            }

            /**
             * Legt den Wert der rights-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRights(String value) {
                this.rights = value;
            }

            /**
             * Ruft den Wert der source-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSource() {
                return source;
            }

            /**
             * Legt den Wert der source-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSource(String value) {
                this.source = value;
            }

            /**
             * Ruft den Wert der subject-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSubject() {
                return subject;
            }

            /**
             * Legt den Wert der subject-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSubject(String value) {
                this.subject = value;
            }

            /**
             * Ruft den Wert der title-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTitle() {
                return title;
            }

            /**
             * Legt den Wert der title-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTitle(String value) {
                this.title = value;
            }

            /**
             * Ruft den Wert der type-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Legt den Wert der type-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }

            /**
             * Ruft den Wert der status-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStatus() {
                return status;
            }

            /**
             * Legt den Wert der status-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStatus(String value) {
                this.status = value;
            }

            /**
             * Ruft den Wert der note-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNote() {
                return note;
            }

            /**
             * Legt den Wert der note-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNote(String value) {
                this.note = value;
            }

            /**
             * Ruft den Wert der confidenceScore-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getConfidenceScore() {
                return confidenceScore;
            }

            /**
             * Legt den Wert der confidenceScore-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setConfidenceScore(String value) {
                this.confidenceScore = value;
            }

            /**
             * Ruft den Wert der lexicalized-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLexicalized() {
                if (lexicalized == null) {
                    return "true";
                } else {
                    return lexicalized;
                }
            }

            /**
             * Legt den Wert der lexicalized-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLexicalized(String value) {
                this.lexicalized = value;
            }

            /**
             * Gets the value of the members property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the members property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getMembers().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Object }
             * 
             * 
             */
            public List<Object> getMembers() {
                if (members == null) {
                    members = new ArrayList<Object>();
                }
                return this.members;
            }

            /**
             * Ruft den Wert der lexfile-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLexfile() {
                return lexfile;
            }

            /**
             * Legt den Wert der lexfile-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLexfile(String value) {
                this.lexfile = value;
            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;attGroup ref="{}attlist.Definition"/&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "content"
            })
            public static class Definition {

                @XmlValue
                protected String content;
                @XmlAttribute(name = "language")
                @XmlSchemaType(name = "anySimpleType")
                protected String language;
                @XmlAttribute(name = "sourceSense")
                @XmlIDREF
                @XmlSchemaType(name = "IDREF")
                protected Object sourceSense;
                @XmlAttribute(name = "contributor", namespace = "https://globalwordnet.github.io/schemas/dc/")
                @XmlSchemaType(name = "anySimpleType")
                protected String contributor;
                @XmlAttribute(name = "coverage", namespace = "https://globalwordnet.github.io/schemas/dc/")
                @XmlSchemaType(name = "anySimpleType")
                protected String coverage;
                @XmlAttribute(name = "creator", namespace = "https://globalwordnet.github.io/schemas/dc/")
                @XmlSchemaType(name = "anySimpleType")
                protected String creator;
                @XmlAttribute(name = "date", namespace = "https://globalwordnet.github.io/schemas/dc/")
                @XmlSchemaType(name = "anySimpleType")
                protected String date;
                @XmlAttribute(name = "description", namespace = "https://globalwordnet.github.io/schemas/dc/")
                @XmlSchemaType(name = "anySimpleType")
                protected String description;
                @XmlAttribute(name = "format", namespace = "https://globalwordnet.github.io/schemas/dc/")
                @XmlSchemaType(name = "anySimpleType")
                protected String format;
                @XmlAttribute(name = "identifier", namespace = "https://globalwordnet.github.io/schemas/dc/")
                @XmlSchemaType(name = "anySimpleType")
                protected String identifier;
                @XmlAttribute(name = "publisher", namespace = "https://globalwordnet.github.io/schemas/dc/")
                @XmlSchemaType(name = "anySimpleType")
                protected String publisher;
                @XmlAttribute(name = "relation", namespace = "https://globalwordnet.github.io/schemas/dc/")
                @XmlSchemaType(name = "anySimpleType")
                protected String relation;
                @XmlAttribute(name = "rights", namespace = "https://globalwordnet.github.io/schemas/dc/")
                @XmlSchemaType(name = "anySimpleType")
                protected String rights;
                @XmlAttribute(name = "source", namespace = "https://globalwordnet.github.io/schemas/dc/")
                @XmlSchemaType(name = "anySimpleType")
                protected String source;
                @XmlAttribute(name = "subject", namespace = "https://globalwordnet.github.io/schemas/dc/")
                @XmlSchemaType(name = "anySimpleType")
                protected String subject;
                @XmlAttribute(name = "title", namespace = "https://globalwordnet.github.io/schemas/dc/")
                @XmlSchemaType(name = "anySimpleType")
                protected String title;
                @XmlAttribute(name = "type", namespace = "https://globalwordnet.github.io/schemas/dc/")
                @XmlSchemaType(name = "anySimpleType")
                protected String type;
                @XmlAttribute(name = "status")
                @XmlSchemaType(name = "anySimpleType")
                protected String status;
                @XmlAttribute(name = "note")
                @XmlSchemaType(name = "anySimpleType")
                protected String note;
                @XmlAttribute(name = "confidenceScore")
                @XmlSchemaType(name = "anySimpleType")
                protected String confidenceScore;

                /**
                 * Ruft den Wert der content-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getContent() {
                    return content;
                }

                /**
                 * Legt den Wert der content-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setContent(String value) {
                    this.content = value;
                }

                /**
                 * Ruft den Wert der language-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLanguage() {
                    return language;
                }

                /**
                 * Legt den Wert der language-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLanguage(String value) {
                    this.language = value;
                }

                /**
                 * Ruft den Wert der sourceSense-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getSourceSense() {
                    return sourceSense;
                }

                /**
                 * Legt den Wert der sourceSense-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setSourceSense(Object value) {
                    this.sourceSense = value;
                }

                /**
                 * Ruft den Wert der contributor-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getContributor() {
                    return contributor;
                }

                /**
                 * Legt den Wert der contributor-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setContributor(String value) {
                    this.contributor = value;
                }

                /**
                 * Ruft den Wert der coverage-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCoverage() {
                    return coverage;
                }

                /**
                 * Legt den Wert der coverage-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCoverage(String value) {
                    this.coverage = value;
                }

                /**
                 * Ruft den Wert der creator-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCreator() {
                    return creator;
                }

                /**
                 * Legt den Wert der creator-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCreator(String value) {
                    this.creator = value;
                }

                /**
                 * Ruft den Wert der date-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDate() {
                    return date;
                }

                /**
                 * Legt den Wert der date-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDate(String value) {
                    this.date = value;
                }

                /**
                 * Ruft den Wert der description-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Legt den Wert der description-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
                }

                /**
                 * Ruft den Wert der format-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFormat() {
                    return format;
                }

                /**
                 * Legt den Wert der format-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFormat(String value) {
                    this.format = value;
                }

                /**
                 * Ruft den Wert der identifier-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIdentifier() {
                    return identifier;
                }

                /**
                 * Legt den Wert der identifier-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIdentifier(String value) {
                    this.identifier = value;
                }

                /**
                 * Ruft den Wert der publisher-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPublisher() {
                    return publisher;
                }

                /**
                 * Legt den Wert der publisher-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPublisher(String value) {
                    this.publisher = value;
                }

                /**
                 * Ruft den Wert der relation-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRelation() {
                    return relation;
                }

                /**
                 * Legt den Wert der relation-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRelation(String value) {
                    this.relation = value;
                }

                /**
                 * Ruft den Wert der rights-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRights() {
                    return rights;
                }

                /**
                 * Legt den Wert der rights-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRights(String value) {
                    this.rights = value;
                }

                /**
                 * Ruft den Wert der source-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSource() {
                    return source;
                }

                /**
                 * Legt den Wert der source-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSource(String value) {
                    this.source = value;
                }

                /**
                 * Ruft den Wert der subject-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSubject() {
                    return subject;
                }

                /**
                 * Legt den Wert der subject-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSubject(String value) {
                    this.subject = value;
                }

                /**
                 * Ruft den Wert der title-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTitle() {
                    return title;
                }

                /**
                 * Legt den Wert der title-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTitle(String value) {
                    this.title = value;
                }

                /**
                 * Ruft den Wert der type-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getType() {
                    return type;
                }

                /**
                 * Legt den Wert der type-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setType(String value) {
                    this.type = value;
                }

                /**
                 * Ruft den Wert der status-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStatus() {
                    return status;
                }

                /**
                 * Legt den Wert der status-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStatus(String value) {
                    this.status = value;
                }

                /**
                 * Ruft den Wert der note-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNote() {
                    return note;
                }

                /**
                 * Legt den Wert der note-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNote(String value) {
                    this.note = value;
                }

                /**
                 * Ruft den Wert der confidenceScore-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getConfidenceScore() {
                    return confidenceScore;
                }

                /**
                 * Legt den Wert der confidenceScore-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setConfidenceScore(String value) {
                    this.confidenceScore = value;
                }

            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;attGroup ref="{}attlist.Example"/&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "content"
            })
            public static class Example {

                @XmlValue
                protected String content;
                @XmlAttribute(name = "language")
                @XmlSchemaType(name = "anySimpleType")
                protected String language;
                @XmlAttribute(name = "contributor", namespace = "https://globalwordnet.github.io/schemas/dc/")
                @XmlSchemaType(name = "anySimpleType")
                protected String contributor;
                @XmlAttribute(name = "coverage", namespace = "https://globalwordnet.github.io/schemas/dc/")
                @XmlSchemaType(name = "anySimpleType")
                protected String coverage;
                @XmlAttribute(name = "creator", namespace = "https://globalwordnet.github.io/schemas/dc/")
                @XmlSchemaType(name = "anySimpleType")
                protected String creator;
                @XmlAttribute(name = "date", namespace = "https://globalwordnet.github.io/schemas/dc/")
                @XmlSchemaType(name = "anySimpleType")
                protected String date;
                @XmlAttribute(name = "description", namespace = "https://globalwordnet.github.io/schemas/dc/")
                @XmlSchemaType(name = "anySimpleType")
                protected String description;
                @XmlAttribute(name = "format", namespace = "https://globalwordnet.github.io/schemas/dc/")
                @XmlSchemaType(name = "anySimpleType")
                protected String format;
                @XmlAttribute(name = "identifier", namespace = "https://globalwordnet.github.io/schemas/dc/")
                @XmlSchemaType(name = "anySimpleType")
                protected String identifier;
                @XmlAttribute(name = "publisher", namespace = "https://globalwordnet.github.io/schemas/dc/")
                @XmlSchemaType(name = "anySimpleType")
                protected String publisher;
                @XmlAttribute(name = "relation", namespace = "https://globalwordnet.github.io/schemas/dc/")
                @XmlSchemaType(name = "anySimpleType")
                protected String relation;
                @XmlAttribute(name = "rights", namespace = "https://globalwordnet.github.io/schemas/dc/")
                @XmlSchemaType(name = "anySimpleType")
                protected String rights;
                @XmlAttribute(name = "source", namespace = "https://globalwordnet.github.io/schemas/dc/")
                @XmlSchemaType(name = "anySimpleType")
                protected String source;
                @XmlAttribute(name = "subject", namespace = "https://globalwordnet.github.io/schemas/dc/")
                @XmlSchemaType(name = "anySimpleType")
                protected String subject;
                @XmlAttribute(name = "title", namespace = "https://globalwordnet.github.io/schemas/dc/")
                @XmlSchemaType(name = "anySimpleType")
                protected String title;
                @XmlAttribute(name = "type", namespace = "https://globalwordnet.github.io/schemas/dc/")
                @XmlSchemaType(name = "anySimpleType")
                protected String type;
                @XmlAttribute(name = "status")
                @XmlSchemaType(name = "anySimpleType")
                protected String status;
                @XmlAttribute(name = "note")
                @XmlSchemaType(name = "anySimpleType")
                protected String note;
                @XmlAttribute(name = "confidenceScore")
                @XmlSchemaType(name = "anySimpleType")
                protected String confidenceScore;

                /**
                 * Ruft den Wert der content-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getContent() {
                    return content;
                }

                /**
                 * Legt den Wert der content-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setContent(String value) {
                    this.content = value;
                }

                /**
                 * Ruft den Wert der language-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLanguage() {
                    return language;
                }

                /**
                 * Legt den Wert der language-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLanguage(String value) {
                    this.language = value;
                }

                /**
                 * Ruft den Wert der contributor-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getContributor() {
                    return contributor;
                }

                /**
                 * Legt den Wert der contributor-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setContributor(String value) {
                    this.contributor = value;
                }

                /**
                 * Ruft den Wert der coverage-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCoverage() {
                    return coverage;
                }

                /**
                 * Legt den Wert der coverage-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCoverage(String value) {
                    this.coverage = value;
                }

                /**
                 * Ruft den Wert der creator-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCreator() {
                    return creator;
                }

                /**
                 * Legt den Wert der creator-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCreator(String value) {
                    this.creator = value;
                }

                /**
                 * Ruft den Wert der date-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDate() {
                    return date;
                }

                /**
                 * Legt den Wert der date-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDate(String value) {
                    this.date = value;
                }

                /**
                 * Ruft den Wert der description-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Legt den Wert der description-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
                }

                /**
                 * Ruft den Wert der format-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFormat() {
                    return format;
                }

                /**
                 * Legt den Wert der format-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFormat(String value) {
                    this.format = value;
                }

                /**
                 * Ruft den Wert der identifier-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIdentifier() {
                    return identifier;
                }

                /**
                 * Legt den Wert der identifier-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIdentifier(String value) {
                    this.identifier = value;
                }

                /**
                 * Ruft den Wert der publisher-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPublisher() {
                    return publisher;
                }

                /**
                 * Legt den Wert der publisher-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPublisher(String value) {
                    this.publisher = value;
                }

                /**
                 * Ruft den Wert der relation-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRelation() {
                    return relation;
                }

                /**
                 * Legt den Wert der relation-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRelation(String value) {
                    this.relation = value;
                }

                /**
                 * Ruft den Wert der rights-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRights() {
                    return rights;
                }

                /**
                 * Legt den Wert der rights-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRights(String value) {
                    this.rights = value;
                }

                /**
                 * Ruft den Wert der source-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSource() {
                    return source;
                }

                /**
                 * Legt den Wert der source-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSource(String value) {
                    this.source = value;
                }

                /**
                 * Ruft den Wert der subject-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSubject() {
                    return subject;
                }

                /**
                 * Legt den Wert der subject-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSubject(String value) {
                    this.subject = value;
                }

                /**
                 * Ruft den Wert der title-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTitle() {
                    return title;
                }

                /**
                 * Legt den Wert der title-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTitle(String value) {
                    this.title = value;
                }

                /**
                 * Ruft den Wert der type-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getType() {
                    return type;
                }

                /**
                 * Legt den Wert der type-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setType(String value) {
                    this.type = value;
                }

                /**
                 * Ruft den Wert der status-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStatus() {
                    return status;
                }

                /**
                 * Legt den Wert der status-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStatus(String value) {
                    this.status = value;
                }

                /**
                 * Ruft den Wert der note-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNote() {
                    return note;
                }

                /**
                 * Legt den Wert der note-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNote(String value) {
                    this.note = value;
                }

                /**
                 * Ruft den Wert der confidenceScore-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getConfidenceScore() {
                    return confidenceScore;
                }

                /**
                 * Legt den Wert der confidenceScore-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setConfidenceScore(String value) {
                    this.confidenceScore = value;
                }

            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;attGroup ref="{}attlist.SynsetRelation"/&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class SynsetRelation {

                @XmlAttribute(name = "target", required = true)
                @XmlIDREF
                @XmlSchemaType(name = "IDREF")
                protected Object target;
                @XmlAttribute(name = "relType", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String relType;
                @XmlAttribute(name = "contributor", namespace = "https://globalwordnet.github.io/schemas/dc/")
                @XmlSchemaType(name = "anySimpleType")
                protected String contributor;
                @XmlAttribute(name = "coverage", namespace = "https://globalwordnet.github.io/schemas/dc/")
                @XmlSchemaType(name = "anySimpleType")
                protected String coverage;
                @XmlAttribute(name = "creator", namespace = "https://globalwordnet.github.io/schemas/dc/")
                @XmlSchemaType(name = "anySimpleType")
                protected String creator;
                @XmlAttribute(name = "date", namespace = "https://globalwordnet.github.io/schemas/dc/")
                @XmlSchemaType(name = "anySimpleType")
                protected String date;
                @XmlAttribute(name = "description", namespace = "https://globalwordnet.github.io/schemas/dc/")
                @XmlSchemaType(name = "anySimpleType")
                protected String description;
                @XmlAttribute(name = "format", namespace = "https://globalwordnet.github.io/schemas/dc/")
                @XmlSchemaType(name = "anySimpleType")
                protected String format;
                @XmlAttribute(name = "identifier", namespace = "https://globalwordnet.github.io/schemas/dc/")
                @XmlSchemaType(name = "anySimpleType")
                protected String identifier;
                @XmlAttribute(name = "publisher", namespace = "https://globalwordnet.github.io/schemas/dc/")
                @XmlSchemaType(name = "anySimpleType")
                protected String publisher;
                @XmlAttribute(name = "relation", namespace = "https://globalwordnet.github.io/schemas/dc/")
                @XmlSchemaType(name = "anySimpleType")
                protected String relation;
                @XmlAttribute(name = "rights", namespace = "https://globalwordnet.github.io/schemas/dc/")
                @XmlSchemaType(name = "anySimpleType")
                protected String rights;
                @XmlAttribute(name = "source", namespace = "https://globalwordnet.github.io/schemas/dc/")
                @XmlSchemaType(name = "anySimpleType")
                protected String source;
                @XmlAttribute(name = "subject", namespace = "https://globalwordnet.github.io/schemas/dc/")
                @XmlSchemaType(name = "anySimpleType")
                protected String subject;
                @XmlAttribute(name = "title", namespace = "https://globalwordnet.github.io/schemas/dc/")
                @XmlSchemaType(name = "anySimpleType")
                protected String title;
                @XmlAttribute(name = "type", namespace = "https://globalwordnet.github.io/schemas/dc/")
                @XmlSchemaType(name = "anySimpleType")
                protected String type;
                @XmlAttribute(name = "status")
                @XmlSchemaType(name = "anySimpleType")
                protected String status;
                @XmlAttribute(name = "note")
                @XmlSchemaType(name = "anySimpleType")
                protected String note;
                @XmlAttribute(name = "confidenceScore")
                @XmlSchemaType(name = "anySimpleType")
                protected String confidenceScore;

                /**
                 * Ruft den Wert der target-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getTarget() {
                    return target;
                }

                /**
                 * Legt den Wert der target-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setTarget(Object value) {
                    this.target = value;
                }

                /**
                 * Ruft den Wert der relType-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRelType() {
                    return relType;
                }

                /**
                 * Legt den Wert der relType-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRelType(String value) {
                    this.relType = value;
                }

                /**
                 * Ruft den Wert der contributor-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getContributor() {
                    return contributor;
                }

                /**
                 * Legt den Wert der contributor-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setContributor(String value) {
                    this.contributor = value;
                }

                /**
                 * Ruft den Wert der coverage-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCoverage() {
                    return coverage;
                }

                /**
                 * Legt den Wert der coverage-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCoverage(String value) {
                    this.coverage = value;
                }

                /**
                 * Ruft den Wert der creator-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCreator() {
                    return creator;
                }

                /**
                 * Legt den Wert der creator-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCreator(String value) {
                    this.creator = value;
                }

                /**
                 * Ruft den Wert der date-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDate() {
                    return date;
                }

                /**
                 * Legt den Wert der date-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDate(String value) {
                    this.date = value;
                }

                /**
                 * Ruft den Wert der description-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Legt den Wert der description-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
                }

                /**
                 * Ruft den Wert der format-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFormat() {
                    return format;
                }

                /**
                 * Legt den Wert der format-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFormat(String value) {
                    this.format = value;
                }

                /**
                 * Ruft den Wert der identifier-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIdentifier() {
                    return identifier;
                }

                /**
                 * Legt den Wert der identifier-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIdentifier(String value) {
                    this.identifier = value;
                }

                /**
                 * Ruft den Wert der publisher-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPublisher() {
                    return publisher;
                }

                /**
                 * Legt den Wert der publisher-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPublisher(String value) {
                    this.publisher = value;
                }

                /**
                 * Ruft den Wert der relation-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRelation() {
                    return relation;
                }

                /**
                 * Legt den Wert der relation-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRelation(String value) {
                    this.relation = value;
                }

                /**
                 * Ruft den Wert der rights-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRights() {
                    return rights;
                }

                /**
                 * Legt den Wert der rights-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRights(String value) {
                    this.rights = value;
                }

                /**
                 * Ruft den Wert der source-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSource() {
                    return source;
                }

                /**
                 * Legt den Wert der source-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSource(String value) {
                    this.source = value;
                }

                /**
                 * Ruft den Wert der subject-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSubject() {
                    return subject;
                }

                /**
                 * Legt den Wert der subject-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSubject(String value) {
                    this.subject = value;
                }

                /**
                 * Ruft den Wert der title-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTitle() {
                    return title;
                }

                /**
                 * Legt den Wert der title-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTitle(String value) {
                    this.title = value;
                }

                /**
                 * Ruft den Wert der type-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getType() {
                    return type;
                }

                /**
                 * Legt den Wert der type-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setType(String value) {
                    this.type = value;
                }

                /**
                 * Ruft den Wert der status-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStatus() {
                    return status;
                }

                /**
                 * Legt den Wert der status-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStatus(String value) {
                    this.status = value;
                }

                /**
                 * Ruft den Wert der note-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNote() {
                    return note;
                }

                /**
                 * Legt den Wert der note-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNote(String value) {
                    this.note = value;
                }

                /**
                 * Ruft den Wert der confidenceScore-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getConfidenceScore() {
                    return confidenceScore;
                }

                /**
                 * Legt den Wert der confidenceScore-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setConfidenceScore(String value) {
                    this.confidenceScore = value;
                }

            }

        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;attGroup ref="{}attlist.SyntacticBehaviour"/&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class SyntacticBehaviour {

            @XmlAttribute(name = "id")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String id;
            @XmlAttribute(name = "subcategorizationFrame", required = true)
            @XmlSchemaType(name = "anySimpleType")
            protected String subcategorizationFrame;
            @XmlAttribute(name = "senses")
            @XmlIDREF
            @XmlSchemaType(name = "IDREFS")
            protected List<Object> senses;

            /**
             * Ruft den Wert der id-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * Legt den Wert der id-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
            }

            /**
             * Ruft den Wert der subcategorizationFrame-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSubcategorizationFrame() {
                return subcategorizationFrame;
            }

            /**
             * Legt den Wert der subcategorizationFrame-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSubcategorizationFrame(String value) {
                this.subcategorizationFrame = value;
            }

            /**
             * Gets the value of the senses property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the senses property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSenses().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Object }
             * 
             * 
             */
            public List<Object> getSenses() {
                if (senses == null) {
                    senses = new ArrayList<Object>();
                }
                return this.senses;
            }

        }

    }

}
