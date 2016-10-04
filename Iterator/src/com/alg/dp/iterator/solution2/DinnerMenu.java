package com.alg.dp.iterator.solution2;

import java.util.ArrayList;

public class DinnerMenu implements IMenu {
	private ArrayList<MenuItem> menuItems;

	public DinnerMenu() {
		menuItems = new ArrayList<MenuItem>();
	}
	
	public void addItem(MenuItem menuItem) {
		menuItems.add(menuItem);
	}
	
	public ArrayList<MenuItem> getMenuItems() {
		return menuItems;
	}
	
	public Iterator iterator() {
		return new DinnerMenuIterator(this);
	}
}
