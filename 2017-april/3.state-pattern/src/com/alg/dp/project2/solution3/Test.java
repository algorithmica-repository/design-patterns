package com.alg.dp.project2.solution3;

public class Test {

	public static void main(String[] args) {
		GumballMachine m1 = new GumballMachine();
		m1.turnHandle();
		System.out.println(m1);
		m1.addGumballs(10);
		System.out.println(m1);
		m1.turnHandle();
		System.out.println(m1);
		m1.insertCoin();
		System.out.println(m1);
		m1.turnHandle();
		System.out.println(m1);
	}

}
