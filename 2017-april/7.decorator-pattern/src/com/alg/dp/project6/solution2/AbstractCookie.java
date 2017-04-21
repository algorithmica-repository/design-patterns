package com.alg.dp.project6.solution2;

public abstract class AbstractCookie {
	private String description;
	private float price;
	private float qty;
	private float weight;
	private boolean requireNuts;
	private boolean requireSprinkles;	
	
	public AbstractCookie() {
		
	}
	public AbstractCookie(String description, float price) {
		super();
		this.description = description;
		this.price = price;
	}

	public String getCookieDetails() {
		String tmp =  "description=" + description + ", price="
				+ price;
		if(requireNuts)
			tmp = tmp + " qty=" + qty;
		if(requireSprinkles)
			tmp = tmp + " weight=" + weight;
		return tmp;
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
	
	public void requireNuts(boolean requireNuts) {
		this.requireNuts = requireNuts;
		if(requireNuts)
		 description += " with nuts";
	}
	public void requireNuts(boolean requireNuts, float qty) {
		this.requireNuts = requireNuts;
		this.qty = qty;
		if(requireNuts)
			 description += " with nuts";
	}
	
	public void requireSprinkles(boolean requireSprinkles) {
		this.requireSprinkles = requireSprinkles;
		if(requireSprinkles)
			 description += " with sprinkles";
	}
	
	public void requireSprinkles(boolean requireSprinkles, float weight) {
		this.requireSprinkles = requireSprinkles;
		this.weight = weight;
		if(requireSprinkles)
			 description += " with sprinkles";
	}

}
