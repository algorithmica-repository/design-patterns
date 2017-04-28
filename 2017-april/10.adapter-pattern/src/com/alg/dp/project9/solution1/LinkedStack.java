package com.alg.dp.project9.solution1;

import java.util.LinkedList;

public class LinkedStack extends LinkedList<Integer> implements IStack {

	public void push(Integer e) {
		add(0, e);
	}
	
	public Integer pop() {
		if(isEmpty()) return null;
		return remove(0);
	}

}
