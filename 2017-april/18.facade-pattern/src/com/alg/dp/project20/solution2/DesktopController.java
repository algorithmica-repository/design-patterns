package com.alg.dp.project20.solution2;

public class DesktopController {
	private IOrderFacade orderFacade;
	
	public DesktopController(IOrderFacade orderFacade) {
		super();
		this.orderFacade = orderFacade;
	}

	public void orderProduct(Product product, float amount, int cardno, int cvv, Address address) {
		orderFacade.orderProduct(product, amount, cardno, cvv, address);
	}

}
