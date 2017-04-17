package com.alg.dp.project1.solution4;

public abstract class Recipe {	
	private boolean needIngradients;
	
	public Recipe(boolean needIngradients) {
		this.needIngradients = needIngradients;
	}
	
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
		if(needIngradients)
			addIngradients();
	}
	
}
