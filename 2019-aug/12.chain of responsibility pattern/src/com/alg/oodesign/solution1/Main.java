package com.alg.oodesign.solution1;

public class Main {

	public static void main(String[] args) {
		PurchaseOrder po = new PurchaseOrder(500, "Purchase of servers");
		
		SeniorManager sm1 = new SeniorManager("mgr1");
		Director d1 = new Director("dir1");
		VicePresident vp1 = new VicePresident("Vice1");
		
		boolean res = sm1.approve(po);
		if(res == false) {
			res = d1.approve(po);
			if(res ==  false) {
				res = vp1.approve(po);
				if(res == false) {
					res = CEO.getInstance().approve(po);
					if(res == false) {
						ExecutiveCommittee.getInstance().approve(po);
					}
				}
			}
				
		}
	}

}
