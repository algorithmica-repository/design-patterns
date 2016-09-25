package com.alg.dp.tm.solution2;

public class CoffeeRecipe extends AbstractRecipe {
	
	private void brewCoffee() {
		System.out.println("Brewing coffee");
	}
	
	private void addSugarAndMilk() {
		System.out.println("Adding sugar and milk");
	}
	public void makeRecipe() {
		boilWater();
		brewCoffee();
		pourInCup();
		addSugarAndMilk();
	}

}
