package com.alg.dp.project1.solution2;

public class CoffeeRecipe extends Recipe {	
	
	private void addCoffeePowder() {
		System.out.println("Adding coffee powder");
	}
	private void addIngradients() {
		System.out.println("Add milk and sugar");
	}	
	public void makeCoffee() {
		boilWater();
		addCoffeePowder();
		pour();
		addIngradients();
	}

}
