package com.alg.oodesign.solution1;

public class Test {

	public static void main(String[] args) {
		IStack stack = new LinkedStack();
		stack.push(10);
		stack.push(20);
		stack.display();
		System.out.println(stack.top());
		System.out.println(stack.pop());
		stack.display();
	}

}
