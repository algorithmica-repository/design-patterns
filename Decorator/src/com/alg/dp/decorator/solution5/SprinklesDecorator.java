package com.alg.dp.decorator.solution5;

public class SprinklesDecorator implements IDecorator {

	public String getDecorationDescription() {
		return " with Sprinkles";
	}

	public float getDecorationCost() {
		return 2.0f;
	}	
		
}
