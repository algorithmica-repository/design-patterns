package com.alg.design.encapsulation;

public class TestStack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IStack s1 = new ArrayStack();
		System.out.println(s1.top());
	}

}
