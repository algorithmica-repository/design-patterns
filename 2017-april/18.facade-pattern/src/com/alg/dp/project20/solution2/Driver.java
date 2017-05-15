package com.alg.dp.project20.solution2;

public class Driver {

	public static void main(String[] args) {
		Product product1 = new Product("12345", "laptop-dell");
		IOrderFacade orderFacade1 = new OrderFacade1(new DBInventoryService(), new ICICIPaymentService(), new FedExShippingService());
		MobileController order1 = new MobileController(orderFacade1);
		order1.orderProduct(product1, 120, 2345, 112, new Address("1-1", "", "", ""));
		System.out.println();
		
		Product product2 = new Product("12346", "mobile-oppo");
		IOrderFacade orderFacade2 = new OrderFacade1(new DBInventoryService(), new PayPalPaymentService(), new FedExShippingService());
		DesktopController order2 = new DesktopController(orderFacade2);
		order2.orderProduct(product2, 120, 2341, 111, new Address("1-2", "", "", ""));
	}

}
