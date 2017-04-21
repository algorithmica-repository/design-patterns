package com.alg.dp.project6.solution3;

public class SprinklesDecorator extends AbstractCookie {
	private float weight;
	private ICookie cookie;
	
	public SprinklesDecorator(ICookie cookie) {
		this.cookie = cookie;
		setDescription(cookie.getDescription() + " with sprinkles");
		setPrice(cookie.getPrice() + 5);
		weight = 5;
	}
	
	public SprinklesDecorator(ICookie cookie, float weight) {
		this.cookie = cookie;
		setDescription(cookie.getDescription() + " with sprinkles");
		setPrice(cookie.getPrice() + weight * 3);
		this.weight = weight;
	}

	public String getCookieDetails() {
		return  cookie.getCookieDetails() +",weight=" + weight;
	}
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
