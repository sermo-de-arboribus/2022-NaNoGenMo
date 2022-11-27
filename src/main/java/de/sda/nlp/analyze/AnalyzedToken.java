package de.sda.nlp.analyze;

import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class AnalyzedToken {

	private static List<String> APOSTROPHIZED_WORD_COMPONENTS = List.of("'nt", "'s", "'ve");
	
	private String language;
	private String lemma;
	private Map<String, String> morphologicalFeatures;
	private NamedEntityToken namedEntity;
	private String partOfSpeech;
	private String surfaceForm;
	
	public AnalyzedToken(String surfaceForm, String language) {
		this.language = language;
		this.surfaceForm = surfaceForm;
	}
	
	public String getGrammaticalCase() {
		if(this.morphologicalFeatures.containsKey("case")) {
			return this.morphologicalFeatures.get("case");			
		} else {
			return "";
		}
	}

	public String getGrammaticalNumber() {
		if(this.morphologicalFeatures.containsKey("number")) {
			return this.morphologicalFeatures.get("number");			
		} else {
			return "";
		}
	}
	
	public String getLanguage() {
		return language;
	}
	
	public String getLemma() {
		return lemma;
	}
	
	public Map<String, String> getMorphologicalFeatures() {
		return morphologicalFeatures;
	}
	
	public NamedEntityToken getNamedEntity() {
		return namedEntity;
	}

	public String getPartOfSpeech() {
		return partOfSpeech;
	}

	public String getSurfaceForm() {
		return surfaceForm;
	}

	public boolean isIndefiniteArticle() {
		if(this.partOfSpeech.equals("DT") 
				&& morphologicalFeatures.containsKey("definiteness")
				&& morphologicalFeatures.get("definiteness").equals("indefinite")) {
			return true;
		} else {
			return false;			
		}
	}
	
	public boolean isOffsetByBlank() {
		return !(this.isPunctuation() || APOSTROPHIZED_WORD_COMPONENTS.contains(lemma)); 
	}
	
	public boolean isPunctuation() {
		return this.partOfSpeech.startsWith("$")
			|| Pattern.matches("[,;.:]", this.partOfSpeech)
			|| this.partOfSpeech.equals("PUNCT");
	}
	
	public void resetLemmaAndSurfaceForm(String lemma) {
		// TODO: We might do something more sophisticated here, like generating plural forms of singular form lemmata 
		this.surfaceForm = lemma;
		this.lemma = lemma;
	}
	
	public void setMorphologicalFeatures(Map<String, String> morphologicalFeatures) {
		this.morphologicalFeatures = morphologicalFeatures;
	}

	public void setNamedEntity(NamedEntityToken namedEntity) {
		this.namedEntity = namedEntity;
	}
	
	public void setLemma(String lemma) {
		this.lemma = lemma;
	}
	
	public void setPartOfSpeech(String partOfSpeech) {
		this.partOfSpeech = partOfSpeech;
	}
	
	public void setSurfaceForm(String surfaceForm) {
		this.surfaceForm = surfaceForm;
	}
}