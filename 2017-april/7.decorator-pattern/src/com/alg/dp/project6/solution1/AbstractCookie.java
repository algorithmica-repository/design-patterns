package com.alg.dp.project6.solution1;

public abstract class AbstractCookie {
	private String description;
	private float price;
	
	public AbstractCookie(String description, float price) {
		super();
		this.description = description;
		this.price = price;
	}

	public String getCookieDetails() {
		return "description=" + description + ", price="
				+ price;
	}
	
	

}
