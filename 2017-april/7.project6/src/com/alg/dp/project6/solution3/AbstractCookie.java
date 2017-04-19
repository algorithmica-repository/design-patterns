package com.alg.dp.project6.solution3;

public abstract class AbstractCookie {
	private String description;
	private float price;
	
	public AbstractCookie() {
		
	}
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	

}
