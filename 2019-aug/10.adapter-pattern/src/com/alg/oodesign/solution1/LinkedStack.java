package com.alg.oodesign.solution1;

import java.util.LinkedList;

public class LinkedStack implements IStack {
	private LinkedList<Integer> list;
	
	public LinkedStack() {
		list = new  LinkedList<Integer>();
	}

	@Override
	public void push(int x) {
		list.addFirst(x);		
	}

	@Override
	public int pop() {
		if(list.isEmpty()) return Integer.MIN_VALUE;
		return list.removeFirst();
	}

	@Override
	public int top() {
		if(list.isEmpty()) return Integer.MIN_VALUE;
		return list.getFirst();
	}

	@Override
	public void display() {
		for(int x:list)
			System.out.print(x + " ");
		System.out.println();
	}

}
