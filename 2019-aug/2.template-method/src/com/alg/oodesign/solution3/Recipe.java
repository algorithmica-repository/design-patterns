package com.alg.oodesign.solution3;

public abstract class Recipe {
	
	protected void boilWater() {
		System.out.println("boiling water");
	}
	protected void pour() {
		System.out.println("pour into cup");
	}
	protected abstract void addPowder();
	protected abstract void addIngredients();
	public void makeRecipe() {
		boilWater();
		addPowder();
		pour();
		addIngredients();		
	}
}
