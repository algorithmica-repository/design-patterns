package com.alg.dp.tm.solution3;

public abstract class AbstractRecipe {
	
	protected void boilWater() {
		System.out.println("Boiling water");
	}
	
	protected void pourInCup() {
		System.out.println("Pouring in cup");
	}
	
	public void makeRecipe() {
		boilWater();
		addPowder();
		pourInCup();
		addIngradients();
	}
	
	abstract protected void addPowder();
	abstract protected void addIngradients();

}
