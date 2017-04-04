package com.alg.dp.iterator.solution2;

public class BreakfastMenu implements IMenu {
	private MenuItem[] menuitems;
	private int maxItems;
	private int currentItems;
	
	public BreakfastMenu(int maxItems) {
		this.maxItems = maxItems;
		menuitems = new MenuItem[this.maxItems];
	}
	
	public void addItem(MenuItem menuItem) {
		if(currentItems >= maxItems)
			System.out.println("Menu items exceeded limit");
		else {
			menuitems[currentItems++] = menuItem;
		}
	}
	
	public MenuItem[] getMenuItems() {
		return menuitems;
	}
	
	public int size() {
		return currentItems;
	}
	
	public Iterator iterator() {
		return new BreakfastMenuIterator(this);
	}
}
