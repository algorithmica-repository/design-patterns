package com.alg.oodesign.solution0;

public class CircleCookie extends AbstractCookie {

	public CircleCookie(String id, float price, int quantity, float weight) {
		super(id, price, quantity, weight);
		// TODO Auto-generated constructor stub
	}

	public String getDetails() {
		return  super.getDetails() + " Circle Cookie";
	}
	
}
