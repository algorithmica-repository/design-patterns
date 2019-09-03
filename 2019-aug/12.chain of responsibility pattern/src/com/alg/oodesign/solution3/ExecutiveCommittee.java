package com.alg.oodesign.solution3;

public class ExecutiveCommittee extends AbstractRole {
	private static ExecutiveCommittee ec;
	
	private ExecutiveCommittee(String name) {
		super(name, "executive committee", 100000);
	}

	public static ExecutiveCommittee getInstance() {
		if(ec == null)
			ec = new ExecutiveCommittee("EC");
		return ec;
	}
	
}
