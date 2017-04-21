package com.alg.dp.project6.solution4;

public class SprinklesDecorator extends AbstractDecorator {
	private float weight;
	
	public SprinklesDecorator(ICookie cookie) {
		this.cookie = cookie;
		setDescription(cookie.getDescription() + " with sprinkles");
		setPrice(cookie.getPrice() + 5);
		weight = 5;
	}
	
	public SprinklesDecorator(AbstractCookie cookie, float weight) {
		this.cookie = cookie;
		setDescription(cookie.getDescription() + " with sprinkles");
		setPrice(cookie.getPrice() + weight * 3);
		this.weight = weight;
	}

	public String getCookieDetails() {
		return  cookie.getCookieDetails() +",weight=" + weight;
	}


}
