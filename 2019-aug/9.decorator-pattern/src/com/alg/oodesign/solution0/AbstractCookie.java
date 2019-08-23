package com.alg.oodesign.solution0;

public class AbstractCookie {
	private String id;
	private float price;
	private int quantity;
	private float weight;

	public AbstractCookie(String id, float price, int quantity, float weight) {
		super();
		this.id = id;
		this.price = price;
		this.quantity = quantity;
		this.weight = weight;
	}

	public String getDetails() {
		String res = id + "," + price;
		if(quantity != 0)
			res = res + " nuts " + quantity;
		if(weight != 0.0f)
			res = res + " sprinkles " + weight;
		return res;
	}
}
