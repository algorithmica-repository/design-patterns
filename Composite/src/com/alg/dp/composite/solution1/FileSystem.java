package com.alg.dp.composite.solution1;

import java.util.ArrayList;
import java.util.List;

public class FileSystem {
	
	private List<Directory> mycomputer;
	
	public FileSystem() {
		mycomputer = new ArrayList<Directory>();
	}
	
	public void addDirectory(Directory directory) {
		mycomputer.add(directory);
	}

	public void print() {
		for(int i = 0; i < mycomputer.size(); ++i)
			mycomputer.get(i).print();
	}
	
	public int size() {
		int total = 0;
		for(int i = 0; i < mycomputer.size(); ++i)
			total += mycomputer.get(i).cumulativeSize();
		return total;
	}

}
