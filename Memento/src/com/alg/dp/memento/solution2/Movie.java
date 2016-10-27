package com.alg.dp.memento.solution2;

import java.io.Serializable;

public class Movie implements Serializable {
	private int id;
	private String name;
	private float price;
	private int ncopies;
	
	public Movie(int id, String name, float price, int ncopies) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.ncopies = ncopies;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getCopies() {
		return ncopies;
	}

	public void setCopies(int ncopies) {
		this.ncopies = ncopies;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", price=" + price
				+ ", ncopies=" + ncopies + "]";
	}

	public int getId() {
		return id;
	}
	
	
	

}
