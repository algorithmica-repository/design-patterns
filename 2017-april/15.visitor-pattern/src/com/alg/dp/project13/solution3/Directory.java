package com.alg.dp.project13.solution3;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Node {
	private List<Node> children;
	
	public Directory(String name) {
		this(null,name);
	}

	public Directory(Directory parent, String name) {
		super(parent, name);
		children = new ArrayList<Node>();
		if(parent != null)
			parent.add(this);
	}
	
	public void add(Node node) {
		children.add(node);
	}
	
	public int getNumberOfChildren() {
		return children.size();
	}
	
	public Node getChild(int ind) {
		return children.get(ind);
	}

	@Override
	public String toString() {
		return "Directory [name=" + name + "]";
	}

	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
}
