package com.alg.oodesign.solution1;

public class CEO extends AbstractRole {
	private static CEO ceo;
	
	private CEO(String name) {
		super(name, "CEO", 10000);
	}
	public static CEO getInstance() {
		if(ceo == null) 
			ceo = new CEO("ceo");
		return ceo;
	}
	
}
