package com.alg.dp.project14.solution1;

public class VP extends AbstractRole {

	public VP(String name) {
		super(name, "VP");
	}
	
	public boolean approve(float amount) {
		if(amount < 10000) {
			System.out.println("approved by" + toString());
			return true;
		}
		else
			return false;
	}

}
