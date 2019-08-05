package com.alg.oodesign.solution2;

public class Coffee extends Recipe {

	private void addPowder() {
		System.out.println("Coffee Powder added");
	}
	private void addIngredients() {
		System.out.println("Added sugar and milk");
	}
	public void makeCoffee() {
		boilWater();
		addPowder();
		pour();
		addIngredients();		
	}
}
