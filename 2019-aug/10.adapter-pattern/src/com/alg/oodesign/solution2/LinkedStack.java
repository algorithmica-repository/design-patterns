package com.alg.oodesign.solution2;

import java.util.LinkedList;

public class LinkedStack extends LinkedList<Integer> implements IStack{

	public void push(int x) {
		super.addFirst(x);		
	}

	public Integer pop() {
		if(super.isEmpty()) return null;
		return super.removeFirst();
	}

	public Integer top() {
		if(super.isEmpty()) return null;
		return super.getFirst();
	}

	public void display() {
		System.out.println(super.toString());
	}

}
