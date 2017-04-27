package com.alg.dp.project8.solution3;

import java.util.ArrayList;
import java.util.List;

import com.alg.dp.project8.solution3.BreakfastUnit.BreakfastUnitIterator;

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

	public Iterator iterator() {
		return new DinnerUnitIterator();
	}
	
	class DinnerUnitIterator implements Iterator {
		private int current;
		
		@Override
		public boolean hasNext() {
			return current < menuItems.size();
		}

		@Override
		public MenuItem next() {		
			return menuItems.get(current++);
		}
	}

}
