package com.alg.dp.decorator.solution1;

public class SquareSprinklesCookie extends AbstractCookie {

	public SquareSprinklesCookie() {
		description = "Square Cookie with sprinkles";
	}
	public float getCost() {
		return 15.0f + 2.0f;
	}

}
