package com.alg.oodesign.solution3;

public class BreakfastMenu {
	private MenuItem[] items;
	private int size;
	private int capacity;
	
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

	public Iterator getIterator() {
		return new It
	}
	
}
