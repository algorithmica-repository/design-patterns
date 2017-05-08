package com.alg.dp.project8.solution1;

public class BreakfastUnit {
	private MenuItem[] menuItems;
	private int size;
	
	public BreakfastUnit(int n) {
		menuItems = new MenuItem[n];
	}
	
	public void addItem(MenuItem menuItem) {
		if(size == menuItems.length)
			System.out.println("You cannot add any more menu items");
		else
			menuItems[size++] = menuItem;
	}
	
	public MenuItem[] getMenuItems() {
		return menuItems;
	}

}
