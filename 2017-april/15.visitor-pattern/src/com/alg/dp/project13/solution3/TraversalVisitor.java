package com.alg.dp.project13.solution3;

public class TraversalVisitor implements IVisitor {

	@Override
	public void visit(Node node) {
		System.out.println(node);
		for(int i = 0; i < node.getNumberOfChildren(); ++i) {
			visit(node.getChild(i));
		}		
	}

}
