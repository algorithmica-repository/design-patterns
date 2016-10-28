package com.alg.dp.decorator.solution4;

public class SprinklesDecorator extends AbstractCookie {
	private AbstractCookie cookie;
	
	public SprinklesDecorator(AbstractCookie cookie) {
		super();
		this.cookie = cookie;
	}
	@Override
	public String getDescription() {
		return cookie.getDescription() + " with Sprinkles";
	}
	@Override
	public float getCost() {
		return cookie.getCost() + 2.0f;
	}
		
}
