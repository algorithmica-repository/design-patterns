package com.alg.oodesign.solution4;

public class Coffee extends Recipe {

	public Coffee(boolean needIngredients) {
		super(needIngredients);
	}
	protected void addPowder() {
		System.out.println("Coffee Powder added");
	}
	protected void addIngredients() {
		System.out.println("Added sugar and milk");
	}
	
}
