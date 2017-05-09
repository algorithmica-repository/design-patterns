package com.alg.dp.project14.solution1;

public class ExecutiveCommitte extends AbstractHandler {

	public ExecutiveCommitte(String name) {
		super(name, "Executive Committe");
	}
	
	public boolean approve(PurchaseOrder po) {
			System.out.println("approved by " + toString());
			return true;
	}

}
