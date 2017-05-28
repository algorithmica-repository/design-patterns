package com.alg.dp.project17.solutio2;

public class DvdFactory extends ProductFactory {
	public Product getProduct() throws Exception {
		return (Dvd)(prototypes.get("dvd").clone());
	}

}
