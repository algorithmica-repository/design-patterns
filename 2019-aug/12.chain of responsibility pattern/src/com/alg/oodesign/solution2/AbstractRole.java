package com.alg.oodesign.solution2;

public class AbstractRole {
	private String name;
	private String role;
	private float limit;
	private AbstractRole next;
	
	public AbstractRole(String name, String role, float limit) {
		super();
		this.name = name;
		this.role = role;
		this.limit = limit;
	}
	
	public void approve(PurchaseOrder po) {
		if(po.getAmount() <= limit) 
			System.out.println("approved by " +  name + " with authority of " + role);
		else
			next.approve(po);
	}
	
	public void successor(AbstractRole next) {
		this.next = next;
	}
	
}
