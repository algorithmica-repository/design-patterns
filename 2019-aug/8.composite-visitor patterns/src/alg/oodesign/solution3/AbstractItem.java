package com.alg.oodesign.solution3;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractItem {
	private String name;
	private float weight;
	private float cost;
	
	public AbstractItem(String name) {
		super();
		this.name = name;
	}
	
	protected void setCost(float cost) {
		this.cost = cost;
	}

	public AbstractItem(String name, float weight) {
		this.name = name;
		this.weight = weight;;
	}
	
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

	protected String getName() {
		return name;
	}
	
	public float getWeight() {
		return weight;
	}
	
	public float getCost() {
		return cost;
	}
	
	public List<AbstractItem> getChildren() {
		List<AbstractItem> children = new ArrayList<AbstractItem>();
		children.add(this);
		return children;
	}
	public void display() {
		System.out.println("name:" + name);
		System.out.println();
	}

}
