package com.alg.oodesign.solution2;

public class SquareCookie extends AbstractCookie {

	public SquareCookie(String id, float price) {
		super(id, price);
	}

	public String getDetails() {
		return super.getDetails() + " Square Cookie";
	}
}
