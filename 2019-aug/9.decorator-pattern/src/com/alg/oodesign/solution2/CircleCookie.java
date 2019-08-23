package com.alg.oodesign.solution2;

public class CircleCookie extends AbstractCookie {

	public CircleCookie(String id, float price) {
		super(id, price);
	}

	public String getDetails() {
		return  super.getDetails() + " Circle Cookie";
	}
	
}
