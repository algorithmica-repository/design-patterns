package com.alg.dp.project9.solution1;

import java.util.Iterator;
import java.util.Random;

public class Driver {

	public static void main(String[] args) {
		IStack stack1 = new LinkedStack();
		Random  r = new Random();
		for(int i = 1; i <= 10; ++i) {
			stack1.push(r.nextInt(100) + 1);
		}
		Iterator<Integer> iterator = stack1.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
		System.out.println("\n" + stack1.size() + "\n");
		System.out.println(stack1.pop());
		System.out.println("\n" + stack1.size() + "\n");
		iterator = stack1.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
	}

}
