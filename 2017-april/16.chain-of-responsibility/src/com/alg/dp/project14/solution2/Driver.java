package com.alg.dp.project14.solution2;

public class Driver {
	private AbstractHandler init_handler;
	
	public Driver(AbstractHandler handler) {
		init_handler = handler;
	}

	public void approve(PurchaseOrder po) {
		init_handler.approve(po);
	}
	
	public static void main(String[] args) {
		int id = Integer.parseInt(args[0]);
		float amount = Float.parseFloat(args[1]);
		String description = args[2];
		
		PurchaseOrder po = new PurchaseOrder();
		po.setAmount(amount);
		po.setId(id);
		po.setDescription(description);
		
		
		SeniorManager seniorManager = new SeniorManager("seniormanager1", 1000);
		Director director = new Director("director1", 5000);
		VP vp = new VP("vp1", 10000);
		CEO ceo = new CEO("ceo1", 50000);
		ExecutiveCommitte executiveComitte = new ExecutiveCommitte("commitee1", 1000000);
		
		seniorManager.successor(director);
		director.successor(vp);
		vp.successor(ceo);
		ceo.successor(executiveComitte);

		Driver d = new Driver(seniorManager);
		d.approve(po);
	}

}
