package com.alg.dp.facade.solution2;

public class MobileController {
private IOrderFacade orderFacade;
	
	public MobileController(IOrderFacade orderFacade) {
		super();
		this.orderFacade = orderFacade;
	}

	public void orderProduct(Product product, PaymentDetails payment) {
		orderFacade.placeOrder(product, payment);
	}
}
