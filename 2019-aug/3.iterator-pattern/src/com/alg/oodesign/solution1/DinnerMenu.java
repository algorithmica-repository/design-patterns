package com.alg.oodesign.solution1;

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

}
