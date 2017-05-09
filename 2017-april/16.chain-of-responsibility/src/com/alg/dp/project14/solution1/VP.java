package com.alg.dp.project14.solution1;

public class VP extends AbstractHandler {

	public VP(String name) {
		super(name, "VP");
	}
	
	public boolean approve(PurchaseOrder po) {
		if(po.getAmount() < 10000) {
			System.out.println("approved by " + toString());
			return true;
		}
		else
			return false;
	}

}
