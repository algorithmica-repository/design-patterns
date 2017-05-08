package com.alg.dp.project8.solution2;

public class BreakfastUnit implements Iterator {
	private MenuItem[] menuItems;
	private int size;
	private int current;
	
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
	
	@Override
	public boolean hasNext() {
		return current < menuItems.length;
	}

	@Override
	public MenuItem next() {		
		return menuItems[current++];
	}
	
	public void reset() {
		current = 0;
	}

}
