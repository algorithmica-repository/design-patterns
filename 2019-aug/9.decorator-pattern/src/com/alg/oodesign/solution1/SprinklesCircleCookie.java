package com.alg.oodesign.solution1;

public class SprinklesCircleCookie extends CircleCookie {
	private float weight;
	
	public SprinklesCircleCookie(String id, float price, float weight) {
		super(id, price);
		this.weight = weight;
	}

	public String getDetails() {
		return super.getDetails() + " sprinkles " + weight;
	}
}
