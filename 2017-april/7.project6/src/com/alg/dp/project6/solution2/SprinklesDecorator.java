package com.alg.dp.project6.solution2;

public class SprinklesDecorator {
	private float weight;
	private AbstractCookie cookie;
	
	public SprinklesDecorator(AbstractCookie cookie) {
		this.cookie = cookie;
		cookie.setDescription(cookie.getDescription() + " with sprinkles");
		cookie.setPrice(cookie.getPrice() + 5);
		weight = 5;
	}
	
	public SprinklesDecorator(AbstractCookie cookie, float weight) {
		this.cookie = cookie;
		cookie.setDescription(cookie.getDescription() + " with sprinkles");
		cookie.setPrice(cookie.getPrice() + weight * 3);
		this.weight = weight;
	}

	@Override
	public String toString() {
		return  cookie.toString() +",weight=" + weight;
	}
	

}
