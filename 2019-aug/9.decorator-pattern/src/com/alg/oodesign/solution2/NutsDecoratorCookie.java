package com.alg.oodesign.solution2;

public class NutsDecoratorCookie {
	private AbstractCookie cookie;
	private int quantity;
	
	public NutsDecoratorCookie(AbstractCookie cookie, int quantity) {
		super();
		this.cookie = cookie;
		this.quantity = quantity;
	}
	
	public String getDetails() {
		return cookie.getDetails() + " nuts " + quantity;
	}
	
}
