package com.alg.dp.project12.solution2;

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
	
	public void traverse() {	
		System.out.println(this);
		for(Node node: children) {
			node.traverse();
		}
	}

	@Override
	public String toString() {
		return "Directory [name=" + name + "]";
	}
	
	public void find(String pattern) {
		for(Node node:children) {
			node.find(pattern);
		}
	}
	
}
