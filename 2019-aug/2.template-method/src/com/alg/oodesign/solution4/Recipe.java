package com.alg.oodesign.solution4;

public abstract class Recipe {
	private boolean needIngredients;
	
	public Recipe(boolean needIngredients) {
		this.needIngredients = needIngredients;
	}
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
		if(needIngredients)
			addIngredients();		
	}
}
