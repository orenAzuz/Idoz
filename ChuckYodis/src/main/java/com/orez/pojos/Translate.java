package com.orez.pojos;

import java.io.Serializable;

public class Translate implements Serializable {
	
	private Success success; 
	private Contennts contents;
	
	public Translate () {}

	public Translate(Success success, Contennts contents) {
		super();
		this.success = success;
		this.contents = contents;
	}

	public Success getSuccess() {
		return success;
	}

	public void setSuccess(Success success) {
		this.success = success;
	}

	public Contennts getContents() {
		return contents;
	}

	public void setContents(Contennts contents) {
		this.contents = contents;
	}
	
	

}


