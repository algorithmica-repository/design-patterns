package com.alg.dp.tm.solution4;

public class TeaRecipe extends AbstractRecipe {

	private void steepTea() {		
		System.out.println("Steeping Tea");
	}
		
	private void addLemon() {
		System.out.println("Adding Lemon");
	}

	@Override
	protected void addPowder() {
		System.out.println("Adding Tea powder");		
	}

	@Override
	protected void addIngradients() {
		System.out.println("Adding lemon");		
	}
	

}
