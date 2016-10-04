package com.alg.dp.decorator.solution5;

public class CircleCookie extends AbstractCookie {
	
	public CircleCookie() {
		description = "Circle Cookie";
	}
	
	public float getCost() {
		float res = 10.0f;
		for(IDecorator decorator:decorators)
			res += decorator.getDecorationCost();
		return res;
	}
}
