package com.alg.oodesign.solution4;

public class NutsDecorator implements IDecorator {
	private int quantity;	
	
	public NutsDecorator(int quantity) {
		super();
		this.quantity = quantity;
	}

	@Override
	public String getDecorationDetails() {
		return " nuts " + quantity;
	}

}
