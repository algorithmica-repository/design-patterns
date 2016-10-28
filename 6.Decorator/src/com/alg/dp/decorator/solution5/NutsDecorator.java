package com.alg.dp.decorator.solution5;

public class NutsDecorator implements IDecorator {

	public String getDecorationDescription() {
		return " with Nuts";
	}

	public float getDecorationCost() {
		return 5.0f;
	}	

}
