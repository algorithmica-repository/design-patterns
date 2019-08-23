package com.alg.oodesign.solution4;

public class Book extends AbstractItem {

	public Book(String name, float weight) {
		super(name, weight);
		setCost(0.03f * getWeight() + 5);
	}

}
