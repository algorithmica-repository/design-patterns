package com.alg.oodesign.solution3;

public class MenuItem {
	private String name;
	private int price;
	
	public MenuItem(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "MenuItem [name=" + name + ", price=" + price + "]";
	}
	
}
