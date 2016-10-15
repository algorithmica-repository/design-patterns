package com.alg.dp.composite.solution2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Directory extends Entry {
	private List<Entry> entries;
	
	public Directory(String name, Date date) {
		super(name, date);
		entries = new ArrayList<Entry>();
	}
		
	public void add(Entry entry) {
		entries.add(entry);
	}
	
	public void remove(Entry entry) {
		entries.remove(entry);
	}

	public Entry getChild(int i) {
		return entries.get(i);
	}
	public int size() {
		int total = 0;
		for(int i = 0; i < entries.size(); ++i)
			total += entries.get(i).size();
		return total;
	}
	public void print() {
		
	}
}
