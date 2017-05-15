package com.alg.dp.project13.solution3;

public class SizeVisitor implements IVisitor {
	private int size;

	public SizeVisitor() {
		size = 0;
	}

	@Override
	public void visit(Node node) {	
		size += node.size();
		for(int i = 0; i < node.getNumberOfChildren(); ++i) {
			visit(node.getChild(i));
		}
	}

	public void report() {
		System.out.println("Total size:" + size );
	}
}
