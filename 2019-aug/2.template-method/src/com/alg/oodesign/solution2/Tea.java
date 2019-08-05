package com.alg.oodesign.solution2;

public class Tea extends Recipe {

	private void addPowder() {
		System.out.println("Tea Powder added");
	}
	private void addIngredients() {
		System.out.println("Added lemon");
	}
	public void makeTea() {
		boilWater();
		addPowder();
		pour();
		addIngredients();		
	}
}
