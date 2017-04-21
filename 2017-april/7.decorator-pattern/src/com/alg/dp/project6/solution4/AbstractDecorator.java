package com.alg.dp.project6.solution4;

public abstract class AbstractDecorator implements ICookie {
	protected ICookie cookie;
	
	public float getPrice() {
		return cookie.getPrice();
	}
	
	public String getDescription() {
		return cookie.getDescription();
	}
	
	public void setDescription(String description) {
		cookie.setDescription(description);
	}
	
	public void setPrice(float price) {
		cookie.setPrice(price);
	}
}
