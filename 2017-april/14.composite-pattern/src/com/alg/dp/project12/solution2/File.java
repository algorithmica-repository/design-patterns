package com.alg.dp.project12.solution2;

public class File extends Node {	
	public File(Directory parent, String name) {
		super(parent, name);
		parent.add(this);
	}

	@Override
	public String toString() {
		return "File [name=" + name + ", parent=" + parent + "]";
	}

	public void traverse() {
		System.out.println(this);
	}
	
	public void find(String pattern) {
		if(name.indexOf(pattern) != -1)
			System.out.println(this);
	}

}
