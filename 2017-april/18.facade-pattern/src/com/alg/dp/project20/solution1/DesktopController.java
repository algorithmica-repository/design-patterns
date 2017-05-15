package com.alg.dp.project20.solution1;

public class DesktopController {
	private IInventoryService inventoryService;
	private IPaymentService paymentService;
	private IShippingService shippingService;
	
	public DesktopController(IInventoryService inventoryService,
			IPaymentService paymentService, IShippingService shippingService) {
		super();
		this.inventoryService = inventoryService;
		this.paymentService = paymentService;
		this.shippingService = shippingService;
	}

	public void orderProduct(Product product, float amount, int cardno, int cvv, Address address) {
		if(inventoryService.checkStock(product)) {
			System.out.println("stock available");
			if(paymentService.pay(amount, cardno, cvv)) {
				System.out.println("payment successful");
				if(shippingService.ship(product, address)) {
					System.out.println("product got shipped");
				} else {
					System.out.println("product shipping failed");
				}				
			} else {
				System.out.println("Payment failed");
			}
		}
	}

}
