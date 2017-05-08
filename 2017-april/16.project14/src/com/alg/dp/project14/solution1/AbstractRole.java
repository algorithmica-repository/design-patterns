package com.alg.dp.project14.solution1;

public abstract class AbstractRole {
	private String name;
	private String role;
	
	public AbstractRole(String name, String role) {
		super();
		this.name = name;
		this.role = role;
	}

	@Override
	public String toString() {
		return "AbstractRole [name=" + name + ", role=" + role + "]";
	}
	
	public abstract boolean approve(float amount); 
	
	
}
