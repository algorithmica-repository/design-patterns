package com.alg.oodesign.solution0;

public class SquareCookie extends AbstractCookie {

	public SquareCookie(String id, float price, int quantity, float weight) {
		super(id, price, quantity, weight);
		// TODO Auto-generated constructor stub
	}

	public String getDetails() {
		return super.getDetails() + " Square Cookie";
	}
}
