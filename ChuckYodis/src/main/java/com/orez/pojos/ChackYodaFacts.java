package com.orez.pojos;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class ChackYodaFacts {
	
	@Id
	private int id;
	private String fact_text;
	private Date enterd_date;
	
	public ChackYodaFacts() {}

	public ChackYodaFacts(int id, String fact_text, Date enterd_date) {
		super();
		this.id = id;
		this.fact_text = fact_text;
		this.enterd_date = enterd_date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFact_text() {
		return fact_text;
	}

	public void setFact_text(String fact_text) {
		this.fact_text = fact_text;
	}

	public Date getEnterd_date() {
		return enterd_date;
	}

	public void setEnterd_date(Date enterd_date) {
		this.enterd_date = enterd_date;
	}
	
	
	

}
