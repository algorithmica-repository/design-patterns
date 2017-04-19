package com.alg.dp.project6.solution1;

public abstract class AbstractCookie {
	private String description;
	private float price;
	
	public AbstractCookie(String description, float price) {
		super();
		this.description = description;
		this.price = price;
	}

	@Override
	public String toString() {
		return "description=" + description + ", price="
				+ price;
	}
	
	

}
