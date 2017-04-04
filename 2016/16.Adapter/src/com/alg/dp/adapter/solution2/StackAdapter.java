package com.alg.dp.adapter.solution2;

public class StackAdapter extends LinkedList implements IStack {
	
	public StackAdapter()  {
	
	}

	@Override
	public void push(Integer e) {
		add(0, e);
		
	}

	@Override
	public Integer pop() {
		Integer tmp = get(0);
		remove(0);
		return tmp;
	}

	@Override
	public Integer top() {
		// TODO Auto-generated method stub
		return get(0);
	}

	@Override
	public void display() {
		print();		
	}
	
	

}
