package com.alg.dp.tm.solution5;

public abstract class AbstractRecipe {
	protected boolean flag;	
	
	public AbstractRecipe(boolean flag) {
		this.flag = flag;
	}
	
	protected void boilWater() {
		System.out.println("Boiling water");
	}
	
	protected void pourInCup() {
		System.out.println("Pouring in cup");
	}
	
	public void makeRecipe() {
		boilWater();
		addPowder();
		pourInCup();
		if(flag)
			addIngradients();
		System.out.println();
	}
	
	abstract protected void addPowder();
	abstract protected void addIngradients();
}
