package com.alg.oodesign.solution3;

public class WeightVisitor implements IVisitor {

	@Override
	public void visit(AbstractItem item) {
		float total = 0.0f;
		for(AbstractItem tmp: item.getChildren())
			total += tmp.getWeight();
		System.out.println(total);
	}

}
