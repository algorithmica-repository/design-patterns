package com.alg.oodesign.solution3;

public class AbstractRole {
	private String name;
	private String role;
	private float limit;
	
	public AbstractRole(String name, String role, float limit) {
		super();
		this.name = name;
		this.role = role;
		this.limit = limit;
	}
	
	public boolean approve(PurchaseOrder po) {
		if(po.getAmount() <= limit) {
			System.out.println("approved by " +  name + " with authority of " + role);
			return true;
		}
		return false;
	}
	
}
