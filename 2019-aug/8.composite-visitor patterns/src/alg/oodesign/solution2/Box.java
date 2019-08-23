package com.alg.oodesign.solution2;

import java.util.ArrayList;
import java.util.List;

public class Box extends AbstractItem {
	private List<AbstractItem> items;
	
	public Box(String name) {
		super(name);
		items = new ArrayList<AbstractItem>();
	}
	public void addItem(AbstractItem item) {
		items.add(item);
	}
	public float getWeight() {
		float total = 0.0f;
		for(AbstractItem item: items)
			total += item.getWeight();
		return total;
	}
	
	public float getCost() {
		float total = 0.0f;
		for(AbstractItem item: items)
			total += item.getCost();
		return total;
	}
	
	public void display() {
		System.out.println("Name:" + getName());
		auxDisplay();
	}
	private void auxDisplay() {
		for(AbstractItem item: items)
			item.display();
	}
}
