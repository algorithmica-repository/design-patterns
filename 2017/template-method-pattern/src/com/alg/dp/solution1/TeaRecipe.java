package com.alg.dp.solution1;

public class TeaRecipe {
	
	private void boilWater() {
		System.out.println("Boiling water");
	}	
	private void addTeaPowder() {
		System.out.println("Adding tea powder");
	}
	private void pour() {
		System.out.println("Pouring into cup");
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
