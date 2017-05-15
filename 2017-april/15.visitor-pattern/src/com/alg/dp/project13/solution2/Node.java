package com.alg.dp.project13.solution2;

public abstract class Node {
	protected String name;
	protected Directory parent;
	
	public Node(Directory parent, String name) {
		super();
		this.name = name;
		this.parent = parent;
	}
	
	public abstract void accept(IVisitor visitor);

}
