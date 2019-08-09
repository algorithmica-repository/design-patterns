package com.alg.oodesign.solution2;

public class BreakfastMenu implements Iterator {
	private MenuItem[] items;
	private int size;
	private int capacity;
	private int current;
	
	public BreakfastMenu(int capacity) {
		this.capacity = capacity;
		items = new MenuItem[capacity];
	}
	
	public void addItem(MenuItem item) {
		if(size == capacity)
			System.out.println("You cannot add item");
		else 
			items[size++] = item;
	}

	@Override
	public boolean hasNext() {
		if(current < size) return true;
		return false;
	}

	@Override
	public MenuItem next() {
		return items[current++];
	}

	@Override
	public void reset() {
		current = 0;		
	}
}
