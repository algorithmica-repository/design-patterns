package com.alg.dp.composite.solution2;

import java.util.Date;

public class File extends Entry {
	private int size;
	
	public File(String name, int size, Date date) {
		super(name,date);
		this.size = size;
	}
	
	public int size() {
		return size;
	}

	@Override
	public void add(Entry entry) {
		System.out.println("Notsupported");		
	}

	@Override
	public void remove(Entry entry) {
		System.out.println("Notsupported");		
	}

	@Override
	public Entry getChild(int i) {
		System.out.println("Notsupported");
		return null;
	}
	
	

}
