package com.alg.oodesign.solution1;

public abstract class AbstractItem {
	private String name;
	private float weight;
	
	public AbstractItem(String name, float weight) {
		this.name = name;
		this.weight = weight;;
	}

	public abstract float getCost();

	public float getWeight() {
		return weight;
	}
	
	public void display() {
		System.out.println("name:" + name);
		System.out.println("weight:" + getWeight());
		System.out.println("insurance:"  + getCost());
		System.out.println();
	}

}
