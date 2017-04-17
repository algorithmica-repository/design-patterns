package com.alg.dp.project1.solution4;

public class Test {

	public static void main(String[] args) {
		TeaRecipe tr1 = new TeaRecipe(true);
		tr1.makeRecipe();
		System.out.println();
		TeaRecipe tr2 = new TeaRecipe(false);
		tr2.makeRecipe();
		System.out.println();
		CoffeeRecipe cr1 = new CoffeeRecipe(false);
		cr1.makeRecipe();
	}

}
