package com.alg.oodesign.solution3;

import java.util.ArrayList;
import java.util.List;

public class DinnerMenu implements Iterator {
	private List<MenuItem> items;
	private int current;
	
	public DinnerMenu() {
		items = new ArrayList<MenuItem>();
	}
	public void addItem(MenuItem item){
		items.add(item);
	}
	public List<MenuItem> getItems()  {
		return items;
	}
	@Override
	public boolean hasNext() {
		if(current < items.size()) return true;
		return false;
	}

	@Override
	public MenuItem next() {
		return items.get(current++);
	}

	@Override
	public void reset() {
		current = 0;		
	}
	

}
