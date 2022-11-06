package de.sda.quotes.model;

import java.util.Locale;

public class LocaleParser {

	public static Locale parseXmlLangAttribute(String attValue) {
		String[] attComponents = attValue.split("-");
		if(attComponents.length > 1) {
			return new Locale(attComponents[0], attComponents[1]);
		} else {
			return new Locale(attComponents[0]);
		}
	}
	
	public static String printXmlLangAttribute(Locale locale) {
		return locale.getCountry() + "-" + locale.getCountry();
	}
}
