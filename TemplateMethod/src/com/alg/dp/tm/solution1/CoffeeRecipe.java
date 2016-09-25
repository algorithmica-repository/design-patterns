package com.alg.dp.tm.solution1;

public class CoffeeRecipe {
	
	private void boilWater() {
		System.out.println("Boiling water");
	}
	
	private void brewCoffee() {
		System.out.println("Brewing coffee");
	}
	
	private void pourInCup() {
		System.out.println("Pouring in cup");
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
