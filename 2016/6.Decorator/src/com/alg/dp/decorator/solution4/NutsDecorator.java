package com.alg.dp.decorator.solution4;

public class NutsDecorator extends AbstractCookie {
	private AbstractCookie cookie;	

	public NutsDecorator(AbstractCookie cookie) {
		super();
		this.cookie = cookie;
	}
	@Override
	public String getDescription() {
		return cookie.getDescription() + " with Nuts";
	}
	@Override
	public float getCost() {
		return cookie.getCost() + 5.0f;
	}	

}
