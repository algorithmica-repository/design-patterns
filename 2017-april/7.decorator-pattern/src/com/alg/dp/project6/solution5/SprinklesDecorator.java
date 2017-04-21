package com.alg.dp.project6.solution5;

public class SprinklesDecorator implements IDecorator {
	private float weight;
	
	public SprinklesDecorator() {
		weight = 5;
	}
	
	public SprinklesDecorator(float weight) {
		this.weight = weight;
	}

	public String getDescription() {
		return " with sprinkles";
	}
	
	public float getPrice() {
		return weight * 3;
	}

	public String getDecoratorDetails() {
		return " weight = " + weight;
	}

}
