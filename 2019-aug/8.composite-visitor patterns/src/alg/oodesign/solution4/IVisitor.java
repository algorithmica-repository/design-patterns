package com.alg.oodesign.solution4;

public interface IVisitor {
	void visit(AbstractItem item);
	void visit(Box item);
}
