package com.alg.oodesign.solution1;

public class Test {

	public static void main(String[] args) {
		GumballMachine gbm = new GumballMachine();
		gbm.turnHandle();
		gbm.addGumballs(10);
		gbm.turnHandle();
		gbm.insertCoin();
		gbm.turnHandle();
		System.out.println(gbm);

	}

}
