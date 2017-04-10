package com.alg.dp.oo.encapsulation2;

//encapsulation at method implementation
public abstract class Recipe {
	
	protected void boilWater() {
		System.out.println("Boiling water");
	}
	
	protected void pour() {
		System.out.println("Pouring into cup");
	}
	//encapsulate the method implementations that could vary among child objects
	protected abstract void addPowder();
	protected abstract void addIngradients();
	public void makeRecipe() {
		boilWater();
		addPowder();
		pour();
		addIngradients();
	}
	
}
