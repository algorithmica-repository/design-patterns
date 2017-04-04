package com.alg.dp.decorator.solution3;

public class SprinklesDecorator {
	private AbstractCookie cookie;
	
	public SprinklesDecorator(AbstractCookie cookie) {
		super();
		this.cookie = cookie;
	}

	public String getDescription() {
		return cookie.getDescription() + " with Sprinkles";
	}

	public float getCost() {
		return cookie.getCost() + 2.0f;
	}
		
}
