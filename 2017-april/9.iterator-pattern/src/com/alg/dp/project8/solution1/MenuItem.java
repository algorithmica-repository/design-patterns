package com.alg.dp.project8.solution1;

public class MenuItem {
	private String name;
	private float price;
	private int qty;
	
	public MenuItem(String name, float price, int qty) {
		super();
		this.name = name;
		this.price = price;
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "MenuItem [name=" + name + ", price=" + price + ", qty=" + qty
				+ "]";
	}
	
	
	
}
