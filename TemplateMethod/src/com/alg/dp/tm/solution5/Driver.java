package com.alg.dp.tm.solution5;

public class Driver {
	
	public static void main(String[] args) {
		CoffeeRecipe cr1 = new CoffeeRecipe(true);
		cr1.makeRecipe();
		CoffeeRecipe cr2 = new CoffeeRecipe(false);
		cr2.makeRecipe();
		
		TeaRecipe tr1 = new TeaRecipe(true);
		tr1.makeRecipe();
		TeaRecipe tr2 = new TeaRecipe(false);
		tr2.makeRecipe();
	}

}
