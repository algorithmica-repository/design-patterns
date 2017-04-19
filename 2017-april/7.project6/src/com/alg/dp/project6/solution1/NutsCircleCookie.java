package com.alg.dp.project6.solution1;

public class NutsCircleCookie extends CircleCookie {
	private float weight;
	
	public NutsCircleCookie() {
		super("circle cookie with nuts", 20 + 10);
		weight = 5;
	}
	
	public NutsCircleCookie(float weight) {
		super("circle cookie with nuts", 15 + weight * 4);
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "NutsCircleCookie:" + super.toString() +",weight=" + weight;
	}
	
}
