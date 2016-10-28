package com.alg.dp.sp.solution2;

public class Driver {
	
	public static void main(String[] args) {
		GumballMachine gbm = new GumballMachine();
		
		System.out.println(gbm);		
		gbm.insertQuarter();
		gbm.turnHandle();
		System.out.println();
		
		System.out.println(gbm);
		gbm.addGumballs(100);
		System.out.println();
		
		System.out.println(gbm);
		gbm.insertQuarter();
		gbm.turnHandle();
		System.out.println();
		
		System.out.println(gbm);
		gbm.insertQuarter();
		gbm.insertQuarter();
		gbm.turnHandle();
		System.out.println();
		
	}

}
