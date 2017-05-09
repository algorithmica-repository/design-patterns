package com.alg.dp.project14.solution1;

public class Director extends AbstractHandler {

	public Director(String name) {
		super(name, "Director");
	}
	
	public boolean approve(PurchaseOrder po) {
		if(po.getAmount() < 5000) {
			System.out.println("approved by " + toString());
			return true;
		}
		else
			return false;
	}

}
