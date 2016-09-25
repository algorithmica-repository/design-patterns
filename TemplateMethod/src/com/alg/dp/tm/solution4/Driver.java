package com.alg.dp.tm.solution4;

public class Driver {
	
	public static void main(String[] args) {
		CoffeeRecipe cr = new CoffeeRecipe();
		cr.makeRecipe(true);
		cr.makeRecipe(false);
		
		TeaRecipe tr = new TeaRecipe();
		tr.makeRecipe(true);
		tr.makeRecipe(false);
	}

}
