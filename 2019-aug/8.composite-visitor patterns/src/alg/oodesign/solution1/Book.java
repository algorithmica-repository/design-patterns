package com.alg.oodesign.solution1;

public class Book extends AbstractItem {

	public Book(String name, float weight) {
		super(name, weight);
	}

	@Override
	public float getCost() {
		return 0.03f * getWeight() + 5;
	}

}
