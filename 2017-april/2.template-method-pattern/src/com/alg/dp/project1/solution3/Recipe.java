package com.alg.dp.project1.solution3;

public abstract class Recipe {
	
	protected void boilWater() {
		System.out.println("Boiling water");
	}
	
	protected void pour() {
		System.out.println("Pouring into cup");
	}
	protected abstract void addPowder();
	protected abstract void addIngradients();
	public void makeRecipe() {
		boilWater();
		addPowder();
		pour();
		addIngradients();
	}
	
}
