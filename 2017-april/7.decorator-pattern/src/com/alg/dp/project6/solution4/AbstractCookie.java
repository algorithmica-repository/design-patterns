package com.alg.dp.project6.solution4;

public abstract class AbstractCookie implements ICookie {
	private String description;
	private float price;
	
	public AbstractCookie() {
		
	}
	public AbstractCookie(String description, float price) {
		super();
		this.description = description;
		this.price = price;
	}

	public String getCookieDetails() {
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
