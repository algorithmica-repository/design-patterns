package com.alg.oodesign.solution1;

public class Coffee {

	private void boilWater() {
		System.out.println("boiling water");
	}
	private void addPowder() {
		System.out.println("Coffee Powder added");
	}
	private void pourCoffee() {
		System.out.println("pour into cup");
	}
	private void addIngredients() {
		System.out.println("Added sugar and milk");
	}
	public void makeCoffee() {
		boilWater();
		addPowder();
		pourCoffee();
		addIngredients();		
	}
}
