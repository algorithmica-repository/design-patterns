package com.alg.dp.tm.solution5;

public class TeaRecipe extends AbstractRecipe {
	
	public TeaRecipe(boolean flag) {
		super(flag);
	}

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
