package com.alg.dp.tm.solution1;

public class TeaRecipe {

	private void boilWater() {
		System.out.println("Boiling water");
	}
	
	private void steepTea() {		
		System.out.println("Steeping Tea");
	}
	
	private void pourInCup() {
		System.out.println("Pouring in cup");
	}
	
	private void addLemon() {
		System.out.println("Adding Lemon");
	}
	public void makeRecipe() {
		boilWater();
		steepTea();
		pourInCup();
		addLemon();
	}

}
