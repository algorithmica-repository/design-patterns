package com.alg.dp.iterator.solution1;

import java.util.ArrayList;

public class DinnerMenu {
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
}
