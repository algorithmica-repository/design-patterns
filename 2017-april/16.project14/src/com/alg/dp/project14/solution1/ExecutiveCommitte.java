package com.alg.dp.project14.solution1;

public class ExecutiveCommitte extends AbstractRole {

	public ExecutiveCommitte(String name) {
		super(name, "Executive Committe");
	}
	
	public boolean approve(float amount) {
			System.out.println("approved by" + toString());
			return true;
	}

}
