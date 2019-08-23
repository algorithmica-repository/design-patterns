package com.alg.oodesign.solution4;

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
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}
	public void display() {
		System.out.println("Name:" + getName());
		auxDisplay();
	}
	private void auxDisplay() {
		for(AbstractItem item: items)
			item.display();
	}
	public List<AbstractItem> getChildren() {
		return items;
	}
}
