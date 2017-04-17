package com.alg.dp.project1.solution2;

public class TeaRecipe extends Recipe {
	
	private void addTeaPowder() {
		System.out.println("Adding tea powder");
	}
	private void addIngradients() {
		System.out.println("Add lemon");
	}
	
	public void makeTea() {
		boilWater();
		addTeaPowder();
		pour();
		addIngradients();
	}

}
