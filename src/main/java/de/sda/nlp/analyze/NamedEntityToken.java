package de.sda.nlp.analyze;

public class NamedEntityToken {

	private String type;
	private boolean isBeginning;
	private boolean isEnding;
	
	public NamedEntityToken(String type, boolean isBeginning, boolean isEnding) {
		this.type = type;
		this.isBeginning = isBeginning;
		this.isEnding = isEnding;
	}

	public String getType() {
		return type;
	}

	public boolean isBeginning() {
		return isBeginning;
	}

	public boolean isEnding() {
		return isEnding;
	}
}
