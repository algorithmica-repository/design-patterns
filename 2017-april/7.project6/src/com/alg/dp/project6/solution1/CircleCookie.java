package com.alg.dp.project6.solution1;

public class CircleCookie extends AbstractCookie {
	
	public CircleCookie() {
		super("Circle cookie", 20);
	}

	public CircleCookie(String description, float price) {
		super(description, price);
	}
	
	@Override
	public String toString() {
		return "CircleCookie:" + super.toString();
	}
}
