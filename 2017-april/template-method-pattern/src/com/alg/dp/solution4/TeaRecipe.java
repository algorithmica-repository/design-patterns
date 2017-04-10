package com.alg.dp.solution4;

public class TeaRecipe extends Recipe {

	public TeaRecipe(boolean needIngradients) {
		super(needIngradients);
	}
	
	protected void addPowder() {
		System.out.println("Adding tea powder");
	}
	protected void addIngradients() {
		System.out.println("Add lemon");
	}

}
