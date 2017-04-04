package com.alg.dp.solution1;

public class CoffeeRecipe {
	
	private void boilWater() {
		System.out.println("Boiling water");
	}	
	private void addCoffeePowder() {
		System.out.println("Adding coffee powder");
	}
	private void pour() {
		System.out.println("Pouring into cup");
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
