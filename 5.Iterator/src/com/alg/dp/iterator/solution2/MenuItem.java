package com.alg.dp.iterator.solution2;

public class MenuItem {
	private String name;
	private String description;
	private float price;
	private boolean isVeg;
	
	public MenuItem(String name, String description, float price, boolean isVeg) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.isVeg = isVeg;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public boolean isVeg() {
		return isVeg;
	}
	public void setVeg(boolean isVeg) {
		this.isVeg = isVeg;
	}
	@Override
	public String toString() {
		return "MenuItem [name=" + name + ", description=" + description
				+ ", price=" + price + ", isVeg=" + isVeg + "]";
	}
	
	
}
