package com.alg.dp.project13.solution1;

public abstract class Node {
	protected String name;
	protected Directory parent;
	
	public Node(Directory parent, String name) {
		super();
		this.name = name;
		this.parent = parent;
	}
	
	abstract void traverse();
	abstract void find(String pattern);
	abstract long size();

}
