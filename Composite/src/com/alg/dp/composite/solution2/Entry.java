package com.alg.dp.composite.solution2;

import java.util.Date;

public abstract class Entry {
	protected String name;
	protected Date date;
	
	public Entry(String name, Date date) {
		super();
		this.name = name;
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public abstract int size();
	
	public abstract void add(Entry entry);
	public abstract void remove(Entry entry);
	public abstract Entry getChild(int i);
	
	
}
