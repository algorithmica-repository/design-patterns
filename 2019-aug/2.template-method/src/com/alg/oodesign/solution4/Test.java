package com.alg.oodesign.solution4;

public class Test {

	public static void main(String[] args) {
		Coffee c1 = new Coffee(true);
		c1.makeRecipe();
		System.out.println();
		Coffee c2 = new Coffee(false);
		c2.makeRecipe();
		System.out.println();
		Tea t1 = new Tea(true);
		t1.makeRecipe();
		System.out.println();
		Tea t2 = new Tea(false);
		t2.makeRecipe();
		System.out.println();
	}

}
