package com.alg.dp.project17.solutio2;

public class BookFactory extends ProductFactory {
	public Product getProduct() throws Exception {
		return (Book) (prototypes.get("book").clone());
	}
}
