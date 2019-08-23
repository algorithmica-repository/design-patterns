package com.alg.oodesign.solution2;

public class Letter extends AbstractItem {

	public Letter(String name, float weight) {
		super(name, weight);
	}

	@Override
	public float getCost() {
		return 0.02f * getWeight() + 3;
	}

}
