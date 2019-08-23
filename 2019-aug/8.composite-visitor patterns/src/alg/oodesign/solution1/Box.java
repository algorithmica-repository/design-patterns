package com.alg.oodesign.solution1;

import java.util.ArrayList;
import java.util.List;

public class Box {
	private List<AbstractItem> items;
	private List<Box> boxes;
	private String name;
	
	public Box(String name) {
		this.name = name;
		items = new ArrayList<AbstractItem>();
		boxes = new ArrayList<Box>();
	}
	public void addItem(AbstractItem item) {
		items.add(item);
	}
	public void addBox(Box b) {
		boxes.add(b);
	}
	public float getWeight() {
		float total = 0.0f;
		for(AbstractItem item: items)
			total += item.getWeight();
		for(Box box:boxes)
			total += box.getWeight();
		return total;
	}
	
	public float getCost() {
		float total = 0.0f;
		for(AbstractItem item: items)
			total += item.getCost();
		for(Box box:boxes)
			total += box.getCost();
		return total;
	}
	
	public void display() {
		System.out.println("Name:" + name);
		auxDisplay();
	}
	private void auxDisplay() {
		for(AbstractItem item: items)
			item.display();
		for(Box box:boxes)
			box.auxDisplay();
	}
}
