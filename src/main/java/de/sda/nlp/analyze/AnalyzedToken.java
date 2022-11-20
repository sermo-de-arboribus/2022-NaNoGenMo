package de.sda.nlp.analyze;

import java.util.Map;

public class AnalyzedToken {

	private String lemma;
	private Map<String, String> morphologicalFeatures;
	private NamedEntityToken namedEntity;
	private String partOfSpeech;
	private String surfaceForm;
	
	public AnalyzedToken(String surfaceForm) {
		this.surfaceForm = surfaceForm;
	}
	
	public String getGrammaticalCase() {
		if(this.morphologicalFeatures.containsKey("case")) {
			return this.morphologicalFeatures.get("case");			
		} else {
			return "";
		}
	}

	public String getLemma() {
		return lemma;
	}
	public void setLemma(String lemma) {
		this.lemma = lemma;
	}
	public String getPartOfSpeech() {
		return partOfSpeech;
	}
	public void setPartOfSpeech(String partOfSpeech) {
		this.partOfSpeech = partOfSpeech;
	}
	public String getSurfaceForm() {
		return surfaceForm;
	}

	public String getGrammaticalNumber() {
		if(this.morphologicalFeatures.containsKey("number")) {
			return this.morphologicalFeatures.get("number");			
		} else {
			return "";
		}
	}

	public Map<String, String> getMorphologicalFeatures() {
		return morphologicalFeatures;
	}

	public void setMorphologicalFeatures(Map<String, String> morphologicalFeatures) {
		this.morphologicalFeatures = morphologicalFeatures;
	}

	public NamedEntityToken getNamedEntity() {
		return namedEntity;
	}

	public void setNamedEntity(NamedEntityToken namedEntity) {
		this.namedEntity = namedEntity;
	}

}
