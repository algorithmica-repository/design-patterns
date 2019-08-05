package com.alg.oodesign.solution1;

public class Tea {

	private void boilWater() {
		System.out.println("boiling water");
	}
	private void addPowder() {
		System.out.println("Tea Powder added");
	}
	private void pourTea() {
		System.out.println("pour into cup");
	}
	private void addIngredients() {
		System.out.println("Added lemon");
	}
	public void makeTea() {
		boilWater();
		addPowder();
		pourTea();
		addIngredients();		
	}
}
