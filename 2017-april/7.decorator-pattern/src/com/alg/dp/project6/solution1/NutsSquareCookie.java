package com.alg.dp.project6.solution1;

public class NutsSquareCookie extends SquareCookie {
	private float qty;
	
	public NutsSquareCookie() {
		super("square cookie with nuts", 15 + 5);
		qty = 2;
	}
	
	public NutsSquareCookie(float qty) {
		super("square cookie with nuts", 15 + qty * 2);
		this.qty = qty;
	}

	@Override
	public String getCookieDetails() {
		return "NutsSquareCookie:" + super.toString() +",qty=" + qty;
	}
	

}
