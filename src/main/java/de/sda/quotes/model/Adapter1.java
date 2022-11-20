//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2022.11.13 um 05:55:46 PM CET 
//


package de.sda.quotes.model;

import java.util.Locale;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1
    extends XmlAdapter<String, Locale>
{


    public Locale unmarshal(String value) {
        return (de.sda.quotes.model.LocaleParser.parseXmlLangAttribute(value));
    }

    public String marshal(Locale value) {
        return (de.sda.quotes.model.LocaleParser.printXmlLangAttribute(value));
    }

}
