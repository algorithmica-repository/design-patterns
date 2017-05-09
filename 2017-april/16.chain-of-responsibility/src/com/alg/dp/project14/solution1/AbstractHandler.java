package com.alg.dp.project14.solution1;

public abstract class AbstractHandler {
	private String name;
	private String role;
	
	public AbstractHandler(String name, String role) {
		super();
		this.name = name;
		this.role = role;
	}

	@Override
	public String toString() {
		return "AbstractRole [name=" + name + ", role=" + role + "]";
	}
	
	public abstract boolean approve(PurchaseOrder po); 
	
	
}
