package com.alg.oodesign.solution4;

public class WeightVisitor implements IVisitor {

	@Override
	public void visit(Box item) {
		System.out.println("visit for box");
		float total = 0.0f;
		for(AbstractItem tmp: item.getChildren())
			total += tmp.getWeight();
		System.out.println(total);
	}

	@Override
	public void visit(AbstractItem item) {
		System.out.println("visit for leaf items");
		System.out.println(item.getWeight());		
	}

}
