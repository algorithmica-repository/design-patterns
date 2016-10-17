package com.alg.dp.adapter.solution2;

public class Driver {

	public static void main(String[] args) {
		IStack stack1 = new StackAdapter();
		stack1.push(10);
		stack1.push(20);
		stack1.display();

	}

}
