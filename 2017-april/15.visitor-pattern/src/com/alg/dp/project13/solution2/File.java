package com.alg.dp.project13.solution2;

import java.util.Random;

public class File extends Node {	
	public File(Directory parent, String name) {
		super(parent, name);
		parent.add(this);
	}

	@Override
	public String toString() {
		return "File [name=" + name + ", parent=" + parent + "]";
	}
	
	public int size() {
		return new Random().nextInt(1000);
	}

	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

}
