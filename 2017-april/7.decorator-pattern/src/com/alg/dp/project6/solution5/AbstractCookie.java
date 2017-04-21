package com.alg.dp.project6.solution5;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractCookie implements ICookie {
	private String description;
	private float price;
	private List<IDecorator> decorators;
	
	public AbstractCookie() {
		decorators = new ArrayList<IDecorator>();
	}
	public AbstractCookie(String description, float price) {
		this();
		this.description = description;
		this.price = price;
	}

	public String getCookieDetails() {
		String tmp =  "description=" + description + ", price="
				+ price;
		for(IDecorator decorator: decorators)
			tmp = tmp + decorator.getDecoratorDetails();
		return tmp;
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
	
	public void addDecorator(IDecorator decorator) {
		decorators.add(decorator);
		this.description = this.description + decorator.getDescription();
		this.price = this.price + decorator.getPrice();
	}
	

}
