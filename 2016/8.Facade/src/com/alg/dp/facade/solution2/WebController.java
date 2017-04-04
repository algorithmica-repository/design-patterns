package com.alg.dp.facade.solution2;

public class WebController {
	private IOrderFacade orderFacade;
	
	public WebController(IOrderFacade orderFacade) {
		super();
		this.orderFacade = orderFacade;
	}

	public void orderProduct(Product product, PaymentDetails payment) {
		orderFacade.placeOrder(product, payment);
	}
	

}
