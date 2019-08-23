package com.alg.oodesign.solution2;

public abstract class AbstractItem {
	private String name;
	private float weight;
	
	public AbstractItem(String name) {
		super();
		this.name = name;
	}

	public AbstractItem(String name, float weight) {
		this.name = name;
		this.weight = weight;;
	}

	public abstract float getCost();

	public float getWeight() {
		return weight;
	}
	
	protected String getName() {
		return name;
	}

	public void display() {
		System.out.println("name:" + name);
		System.out.println("weight:" + getWeight());
		System.out.println("insurance:"  + getCost());
		System.out.println();
	}

}
