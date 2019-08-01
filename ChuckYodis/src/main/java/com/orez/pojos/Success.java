package com.orez.pojos;

import java.io.Serializable;

public class Success implements Serializable {

	private int total;
	
	public Success() {}

	public Success(int total) {
		this.total = total;
	}
	
	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	
}
