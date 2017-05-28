package com.alg.dp.project17.solutio2;

public class Driver {

	public static void main(String[] args) throws Exception {
		ShoppingCart cart1 = new ShoppingCart();
		BookFactory bfactory = new BookFactory();
		DvdFactory dfactory = new DvdFactory();
		cart1.add(bfactory.getProduct());
		cart1.add(dfactory.getProduct());
		cart1.add(dfactory.getProduct());
	}

}
