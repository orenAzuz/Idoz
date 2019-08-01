package com.orez.pojos;

import java.io.Serializable;

public class Contennts implements Serializable {
	
	private String translated;
	private String text;
	private String translation;
	
	public Contennts () {}

	public Contennts(String translated, String text, String translation) {
		super();
		this.translated = translated;
		this.text = text;
		this.translation = translation;
	}

	public String getTranslated() {
		return translated;
	}

	public void setTranslated(String translated) {
		this.translated = translated;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getTranslation() {
		return translation;
	}

	public void setTranslation(String translation) {
		this.translation = translation;
	}
	
	

}
