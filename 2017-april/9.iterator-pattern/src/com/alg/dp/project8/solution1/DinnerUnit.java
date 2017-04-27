package com.alg.dp.project8.solution1;

import java.util.ArrayList;
import java.util.List;

public class DinnerUnit {
	private List<MenuItem> menuItems;
	
	public DinnerUnit() {
		menuItems = new ArrayList<MenuItem>(); 
	}
	
	public void addItem(MenuItem menuItem) {
		menuItems.add(menuItem);
	}
	
	public List<MenuItem> getMenuItems() {
		return menuItems;
	}

}
