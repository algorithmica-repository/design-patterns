package com.alg.oodesign.solution3;

public class SprinklesDecoratorCookie implements ICookie {
	private ICookie cookie;
	private float weight;
	
	public SprinklesDecoratorCookie(ICookie cookie, float weight) {
		super();
		this.cookie = cookie;
		this.weight = weight;
	}

	public String getDetails() {
		return cookie.getDetails() + " sprinkles " + weight;
	}
	
}
