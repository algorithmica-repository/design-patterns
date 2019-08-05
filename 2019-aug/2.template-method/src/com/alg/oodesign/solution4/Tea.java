package com.alg.oodesign.solution4;

public class Tea extends Recipe {

	public Tea(boolean needIngredients) {	
		super(needIngredients);
	}
	protected void addPowder() {
		System.out.println("Tea Powder added");
	}
	protected void addIngredients() {
		System.out.println("Added lemon");
	}
}
