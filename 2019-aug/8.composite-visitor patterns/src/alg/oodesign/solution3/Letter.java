package com.alg.oodesign.solution3;

public class Letter extends AbstractItem {

	public Letter(String name, float weight) {
		super(name, weight);
		setCost(0.02f * getWeight() + 3);
	}

}
