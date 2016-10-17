package com.alg.dp.adapter.solution1;

public class StackAdapter implements IStack {
	
	private IList list;
	
	public StackAdapter()  {
		list = new LinkedList();
	}

	@Override
	public void push(Integer e) {
		list.add(0, e);
		
	}

	@Override
	public Integer pop() {
		Integer tmp = list.get(0);
		list.remove(0);
		return tmp;
	}

	@Override
	public Integer top() {
		// TODO Auto-generated method stub
		return list.get(0);
	}

	@Override
	public void display() {
		list.print();		
	}
	
	

}
