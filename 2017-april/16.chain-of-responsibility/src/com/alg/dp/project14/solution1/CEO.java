package com.alg.dp.project14.solution1;

public class CEO extends AbstractHandler {

	public CEO(String name) {
		super(name, "CEO");
	}
	
	public boolean approve(PurchaseOrder po) {
		if(po.getAmount() < 50000) {
			System.out.println("approved by " + toString());
			return true;
		}
		else
			return false;
	}

}
