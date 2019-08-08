package com.alg.oodesign.solution1;

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
	public MenuItem[] getItems() {
		return items;
	}
}
