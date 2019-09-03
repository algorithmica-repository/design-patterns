package com.alg.oodesign.solution3;

public class PurchaseOrder {
	private float amount;
	private String description;
	
	public PurchaseOrder(float amount, String description) {
		super();
		this.amount = amount;
		this.description = description;
	}
	public float getAmount() {
		return amount;
	}
	public String getDescription() {
		return description;
	}
	
	
}
