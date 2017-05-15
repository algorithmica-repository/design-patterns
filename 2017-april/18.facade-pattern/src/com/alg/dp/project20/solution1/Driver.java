package com.alg.dp.project20.solution1;

public class Driver {

	public static void main(String[] args) {
		Product product1 = new Product("12345", "laptop-dell");
		MobileController order1 = new MobileController(new DBInventoryService(), new ICICIPaymentService(), new FedExShippingService());
		order1.orderProduct(product1, 120, 2345, 112, new Address("1-1", "", "", ""));
		System.out.println();
		Product product2 = new Product("12346", "mobile-oppo");
		DesktopController order2 = new DesktopController(new DBInventoryService(), new PayPalPaymentService(), new FedExShippingService());
		order2.orderProduct(product2, 120, 2341, 111, new Address("1-2", "", "", ""));
	}

}
