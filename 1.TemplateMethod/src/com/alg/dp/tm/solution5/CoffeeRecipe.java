package com.alg.dp.tm.solution5;

public class CoffeeRecipe extends AbstractRecipe {
	
	public CoffeeRecipe(boolean flag) {
		super(flag);
	}
	
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
