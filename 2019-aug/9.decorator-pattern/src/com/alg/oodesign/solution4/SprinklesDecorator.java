package com.alg.oodesign.solution4;

public class SprinklesDecorator implements IDecorator {
	private float weight;
	
	public SprinklesDecorator(float weight) {
		super();
		this.weight = weight;
	}

	@Override
	public String getDecorationDetails() {
		return " sprinkles " + weight;
	}

}
