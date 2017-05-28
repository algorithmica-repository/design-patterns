package com.alg.dp.project17.solutio2;

import java.util.HashMap;
import java.util.Map;

public abstract class ProductFactory {
	protected Map<String, Product> prototypes;
	
	public ProductFactory() {
		prototypes = new HashMap<String, Product>();
	}
	
	public abstract Product getProduct() throws Exception;

}
