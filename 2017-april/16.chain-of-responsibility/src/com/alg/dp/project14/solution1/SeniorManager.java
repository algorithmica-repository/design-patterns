package com.alg.dp.project14.solution1;

public class SeniorManager extends AbstractHandler {
	
	public SeniorManager(String name) {
		super(name, "Senior Manager");
	}
	
	public boolean approve(PurchaseOrder po) {
		if(po.getAmount() < 1000) {
			System.out.println("approved by " + toString());
			return true;
		}
		else
			return false;
	}
}
