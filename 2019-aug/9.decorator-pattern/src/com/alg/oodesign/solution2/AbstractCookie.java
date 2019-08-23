package com.alg.oodesign.solution2;

public class AbstractCookie {
	private String id;
	private float price;
	
	public AbstractCookie(String id, float price) {
		super();
		this.id = id;
		this.price = price;
	}
	
	public String getDetails() {
		return id + "," + price;
	}
}
