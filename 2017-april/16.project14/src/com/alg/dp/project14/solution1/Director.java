package com.alg.dp.project14.solution1;

public class Director extends AbstractRole {

	public Director(String name) {
		super(name, "Director");
	}
	
	public boolean approve(float amount) {
		if(amount < 5000) {
			System.out.println("approved by" + toString());
			return true;
		}
		else
			return false;
	}

}
