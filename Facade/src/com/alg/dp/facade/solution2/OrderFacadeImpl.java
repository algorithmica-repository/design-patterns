package com.alg.dp.facade.solution2;

public class OrderFacadeImpl implements IOrderFacade {
	private IInventoryService inventoryService;
	private IShippingService shippingService;
	private IPaymentService paymentService;
	
	public OrderFacadeImpl(IInventoryService inventoryService,
			IShippingService shippingService, IPaymentService paymentService) {
		super();
		this.inventoryService = inventoryService;
		this.shippingService = shippingService;
		this.paymentService = paymentService;
	}
	
	public void placeOrder(Product product,PaymentDetails payment) {
		if(inventoryService.isStockAvailable(product)) {
			System.out.println("Stock available");
			if(paymentService.doPayment(payment)) {
				System.out.println("Payment done");
				if(shippingService.shipProduct(product)) {
					System.out.println("Product has shipped to customer");
				} else {
					System.out.println("Shipping in progress");
				}
			} else {
				System.out.println("Payment unsuccessful");
			}
		} else {
			System.out.println("Out of stock");				
		}
	}

}
