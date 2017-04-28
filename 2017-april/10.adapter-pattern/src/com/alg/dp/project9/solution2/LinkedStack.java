package com.alg.dp.project9.solution2;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedStack implements IStack {
	private LinkedList<Integer> list;
	
	public LinkedStack() {
		list = new LinkedList<Integer>();
	}

	public void push(Integer e) {
		list.add(0, e);
	}
	
	public Integer pop() {
		if(list.isEmpty()) return null;
		return list.remove(0);
	}
	
	public int size() {
		return list.size();
	}
	
	public Iterator<Integer> iterator() {
		return list.iterator();
	}

}
