package com.alg.oodesign.solution1;

public class NutsCircleCookie extends CircleCookie {
	private int quantity;
	
	public NutsCircleCookie(String id, float price, int quantity) {
		super(id, price);
		this.quantity = quantity;
	}
	public String getDetails() {
		return super.getDetails() + " nuts" + quantity ;
	}
}
