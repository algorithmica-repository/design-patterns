package com.alg.dp.tm.solution2;

public class TeaRecipe extends AbstractRecipe {

	private void steepTea() {		
		System.out.println("Steeping Tea");
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
