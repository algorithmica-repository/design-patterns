package com.alg.dp.project6.solution1;

public class SquareCookie extends AbstractCookie {
	
	public SquareCookie() {
		super("Square cookie", 15);
	}
	public SquareCookie(String description, float price) {
		super(description, price);
	}
	
	@Override
	public String getCookieDetails() {
		return "SquareCookie:" + super.toString();
	}

}
