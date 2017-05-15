package com.alg.dp.project20.solution2;

public class DBInventoryService implements IInventoryService {

	@Override
	public boolean checkStock(Product product) {
		return Math.random() > 0.4?true:false;
	}

}
