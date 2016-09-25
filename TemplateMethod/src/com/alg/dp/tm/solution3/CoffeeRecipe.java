package com.alg.dp.tm.solution3;

public class CoffeeRecipe extends AbstractRecipe {
	
	private void brewCoffee() {
		System.out.println("Brewing coffee");
	}
	
	private void addSugarAndMilk() {
		System.out.println("Adding sugar and milk");
	}

	@Override
	protected void addPowder() {
		System.out.println("Adding Coffee powder");		
	}

	@Override
	protected void addIngradients() {
		System.out.println("Adding sugar and milk");		
	}

}
