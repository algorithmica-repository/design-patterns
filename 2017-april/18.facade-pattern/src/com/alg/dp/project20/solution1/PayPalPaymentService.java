package com.alg.dp.project20.solution1;

public class PayPalPaymentService implements IPaymentService {

	@Override
	public boolean pay(float amount, int cardno, int cvv) {
		return Math.random()>0.5?true:false;
	}

}
