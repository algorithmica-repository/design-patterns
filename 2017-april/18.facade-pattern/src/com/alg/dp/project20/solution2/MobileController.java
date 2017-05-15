package com.alg.dp.project20.solution2;

public class MobileController {
	private IOrderFacade orderFacade;
	
	public MobileController(IOrderFacade orderFacade) {
		super();
		this.orderFacade = orderFacade;
	}

	public void orderProduct(Product product, float amount, int cardno, int cvv, Address address) {
		orderFacade.orderProduct(product, amount, cardno, cvv, address);
	}

}
