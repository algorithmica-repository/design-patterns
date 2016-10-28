package com.alg.dp.decorator.solution5;

public class SquareCookie extends AbstractCookie {

	public SquareCookie() {
		description = "Square Cookie";
	}
	public float getCost() {
		float res = 15.0f;
		for(IDecorator decorator:decorators)
			res += decorator.getDecorationCost();
		return res;
	}

}
