package com.alg.oodesign.solution4;

import java.util.ArrayList;
import java.util.List;

public class AbstractCookie {
	private String id;
	private float price;
	private List<IDecorator> decorators;

	public AbstractCookie(String id, float price) {
		super();
		this.id = id;
		this.price = price;
		decorators = new ArrayList<IDecorator>();
	}
	public void addDecorator(IDecorator decorator) {
		decorators.add(decorator);
	}
	public String getDetails() {
		String res = id + "," + price;
		for(IDecorator d: decorators)
			res = res + d.getDecorationDetails();
		return res;
	}
}
