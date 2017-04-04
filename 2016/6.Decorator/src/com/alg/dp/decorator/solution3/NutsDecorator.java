package com.alg.dp.decorator.solution3;

public class NutsDecorator {
	private AbstractCookie cookie;	

	public NutsDecorator(AbstractCookie cookie) {
		super();
		this.cookie = cookie;
	}

	public String getDescription() {
		return cookie.getDescription() + " with Nuts";
	}

	public float getCost() {
		return cookie.getCost() + 5.0f;
	}	

}
