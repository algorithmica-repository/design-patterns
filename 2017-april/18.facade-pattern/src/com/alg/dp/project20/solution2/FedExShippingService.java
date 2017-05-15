package com.alg.dp.project20.solution2;

public class FedExShippingService implements IShippingService {

	@Override
	public boolean ship(Product product, Address address) {
		return Math.random()>0.5?true:false;
	}

}
