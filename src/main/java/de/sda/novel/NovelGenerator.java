package de.sda.novel;

import de.sda.literature.LiteraturGenerator;

import java.util.Locale;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Component;

// @Component
public class NovelGenerator implements LiteraturGenerator {

	private Locale languageToBeUsed;
	private String[] genresToBeExcluded;
	
	@Override
	public void generateWork() {
		// TODO Auto-generated method stub
		System.out.println(languageToBeUsed);
		System.out.println(genresToBeExcluded);
	}
	
	public void setLanguageToBeUsed(String locale) {
		this.languageToBeUsed = new Locale(locale);
	}
	
	public void setGenresToBeExcluded(String[] excludes) {
		this.genresToBeExcluded = excludes;
	}
}
