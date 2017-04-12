package com.alg.dp.oo.extensibility;

public class Test {

	//since stack implementations could change, we are hiding all the stack implementations behind Istack interface
	//class level encapsulation
	//the ideas in oo-paradigm that supports class level encapsulation are: inheritance, polymorphism, dynamic binding
	public static void testStack(IStack stack) {
		stack.push(10);
		stack.push(20);
		System.out.println(stack.pop());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
