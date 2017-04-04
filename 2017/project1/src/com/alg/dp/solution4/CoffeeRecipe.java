package com.alg.dp.solution4;

public class CoffeeRecipe extends Recipe {	
	
	public CoffeeRecipe(boolean needIngradients) {
		super(needIngradients);
	}
	
	protected void addPowder() {
		System.out.println("Adding coffee powder");
	}
	protected void addIngradients() {
		System.out.println("Add milk and sugar");
	}	

}
