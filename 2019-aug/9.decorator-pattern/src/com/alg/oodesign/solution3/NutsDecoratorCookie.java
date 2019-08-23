package com.alg.oodesign.solution3;

public class NutsDecoratorCookie implements ICookie  {
	private ICookie cookie;
	private int quantity;
	
	public NutsDecoratorCookie(ICookie cookie, int quantity) {
		super();
		this.cookie = cookie;
		this.quantity = quantity;
	}
	
	public String getDetails() {
		return cookie.getDetails() + " nuts " + quantity;
	}
	
}
