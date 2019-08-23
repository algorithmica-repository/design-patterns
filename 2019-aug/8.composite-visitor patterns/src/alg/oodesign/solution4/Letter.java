package com.alg.oodesign.solution4;

public class Letter extends AbstractItem {

	public Letter(String name, float weight) {
		super(name, weight);
		setCost(0.02f * getWeight() + 3);
	}

}
