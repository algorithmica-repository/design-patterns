package com.alg.dp.project6.solution5;

public class NutsDecorator implements IDecorator {
	private float qty;
	
	public NutsDecorator() {
		qty = 5;
	}
	
	public NutsDecorator(float qty) {
		this.qty = qty;
	}

	public String getDescription() {
		return " with Nuts";
	}
	
	public float getPrice() {
		return 2 * qty;
	}
	
	public String getDecoratorDetails() {
		return " qty = " + qty;
	}
}
