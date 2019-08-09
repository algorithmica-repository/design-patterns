package com.alg.oodesign.solution32;

import java.util.ArrayList;
import java.util.List;

public class DinnerMenu {
	private List<MenuItem> items;
	
	public DinnerMenu() {
		items = new ArrayList<MenuItem>();
	}
	public void addItem(MenuItem item){
		items.add(item);
	}
	public List<MenuItem> getItems()  {
		return items;
	}

	public Iterator iterator() {
		return new DinnerIterator();
	}
	
	class DinnerIterator implements Iterator {
		private int current;

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

}
