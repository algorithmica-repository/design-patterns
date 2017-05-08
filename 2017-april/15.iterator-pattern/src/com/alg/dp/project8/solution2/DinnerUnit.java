package com.alg.dp.project8.solution2;

import java.util.ArrayList;
import java.util.List;

public class DinnerUnit implements Iterator {
	private List<MenuItem> menuItems;
	private int current;
	
	public DinnerUnit() {
		menuItems = new ArrayList<MenuItem>();
		current = 0;
	}
	
	public void addItem(MenuItem menuItem) {
		menuItems.add(menuItem);
	}
	
	public List<MenuItem> getMenuItems() {
		return menuItems;
	}

	@Override
	public boolean hasNext() {
		return current < menuItems.size();
	}

	@Override
	public MenuItem next() {		
		return menuItems.get(current++);
	}
	
	public void reset() {
		current = 0;
	}

}
