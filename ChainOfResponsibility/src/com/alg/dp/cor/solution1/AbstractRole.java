package com.alg.dp.cor.solution1;

public abstract class AbstractRole {
	private float maxLimit;
	private int id;

	public AbstractRole(int id, float maxLimit) {
		super();
		this.id = id;
		this.maxLimit = maxLimit;
	}
	
	public abstract String getRole();

	public boolean approve(float amount) {
		if(amount < maxLimit) {
			System.out.println(amount + " is approved by " + getRole() + " with id:" + id);
			return true;
		}
		else {
			System.out.println("Not authorized for " + amount + " for role "+ getRole());
			return false;
		}
	}

}
