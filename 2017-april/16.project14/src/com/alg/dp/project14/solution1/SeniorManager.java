package com.alg.dp.project14.solution1;

public class SeniorManager extends AbstractRole {
	
	public SeniorManager(String name) {
		super(name, "Senior Manager");
	}
	
	public boolean approve(float amount) {
		if(amount < 1000) {
			System.out.println("approved by" + toString());
			return true;
		}
		else
			return false;
	}
}
