package com.alg.dp.composite.solution1;

import java.util.Date;

public class File {
	private String name;
	private int size;
	private Date date;
	
	public File(String name, int size, Date date) {
		super();
		this.name = name;
		this.size = size;
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	

}
