package com.alg.dp.tm.solution4;

public abstract class AbstractRecipe {
	
	protected void boilWater() {
		System.out.println("Boiling water");
	}
	
	protected void pourInCup() {
		System.out.println("Pouring in cup");
	}
	
	public void makeRecipe(boolean addIngrad) {
		boilWater();
		addPowder();
		pourInCup();
		if(addIngrad)
			addIngradients();
		System.out.println();
	}
	
	abstract protected void addPowder();
	abstract protected void addIngradients();

}
