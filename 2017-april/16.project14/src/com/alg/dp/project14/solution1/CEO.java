package com.alg.dp.project14.solution1;

public class CEO extends AbstractRole {

	public CEO(String name) {
		super(name, "CEO");
	}
	
	public boolean approve(float amount) {
		if(amount < 50000) {
			System.out.println("approved by" + toString());
			return true;
		}
		else
			return false;
	}

}
