package com.alg.oodesign.solution2;

public class SprinklesDecoratorCookie {
	private AbstractCookie cookie;
	private float weight;
	
	public SprinklesDecoratorCookie(AbstractCookie cookie, float weight) {
		super();
		this.cookie = cookie;
		this.weight = weight;
	}

	public String getDetails() {
		return cookie.getDetails() + " sprinkles " + weight;
	}
	
}
