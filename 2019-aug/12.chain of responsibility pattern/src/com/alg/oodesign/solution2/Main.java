package com.alg.oodesign.solution2;

public class Main {

	public static void main(String[] args) {
		PurchaseOrder po = new PurchaseOrder(10000, "Purchase of servers");
		
		SeniorManager sm1 = new SeniorManager("mgr1");
		Director d1 = new Director("dir1");
		VicePresident vp1 = new VicePresident("Vice1");
		CEO ceo = CEO.getInstance();
		ExecutiveCommittee  ec = ExecutiveCommittee.getInstance();

		sm1.successor(d1);
		d1.successor(vp1);
		vp1.successor(ceo);
		ceo.successor(ec);
		
		sm1.approve(po);
	}

}
