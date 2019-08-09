package com.alg.oodesign.solution3;

public class Test {

	public static void main(String[] args) {
		IGumballMachine gbm = new GumballMachine();
		gbm.turnHandle();
		gbm.addGumballs(10);
		gbm.turnHandle();
		gbm.insertCoin();
		gbm.turnHandle();
		System.out.println(gbm);

	}

}
