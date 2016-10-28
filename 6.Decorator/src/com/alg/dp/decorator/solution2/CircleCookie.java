package com.alg.dp.decorator.solution2;

public class CircleCookie extends AbstractCookie {
	
	public CircleCookie() {
		description = "Circle Cookie";
	}
	
	public float getCost() {
		if(requireNuts)
			return 10.0f + 5.0f;
		else if(requireSprinkles)
			return 10.0f + 2.0f;
		else
			return 10.0f;
	}
}
