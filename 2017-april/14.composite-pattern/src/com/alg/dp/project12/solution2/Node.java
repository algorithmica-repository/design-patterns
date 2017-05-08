package com.alg.dp.project12.solution2;

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

}
