package com.alg.dp.decorator.solution2;

public class SquareCookie extends AbstractCookie {

	public SquareCookie() {
		description = "Square Cookie";
	}
	public float getCost() {
		if(requireNuts)
			return 15.0f + 5.0f;
		else if(requireSprinkles)
			return 15.0f + 2.0f;
		else
			return 15.0f;
	}

}
