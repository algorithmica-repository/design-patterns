package com.alg.oodesign.solution3;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		PurchaseOrder po = new PurchaseOrder(500, "Purchase of servers");
		
		SeniorManager sm1 = new SeniorManager("mgr1");
		Director d1 = new Director("dir1");
		VicePresident vp1 = new VicePresident("Vice1");
		CEO ceo = CEO.getInstance();
		ExecutiveCommittee  ec = ExecutiveCommittee.getInstance();
	
		List<AbstractRole> processor_chain = new ArrayList<AbstractRole>();
		processor_chain.add(sm1);
		processor_chain.add(d1);
		processor_chain.add(vp1);
		processor_chain.add(ceo);
		processor_chain.add(ec);
		
		for(AbstractRole role: processor_chain)
			if(role.approve(po)) break;
	}

}
