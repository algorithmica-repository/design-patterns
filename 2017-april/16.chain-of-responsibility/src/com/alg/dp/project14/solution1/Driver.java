package com.alg.dp.project14.solution1;

public class Driver {
	private SeniorManager seniorManager;
	private Director director;
	private VP vp;
	private CEO ceo;
	private ExecutiveCommitte executiveComitte;
	
	public Driver() {
		seniorManager = new SeniorManager("seniormanager1");
		director = new Director("director1");
		vp = new VP("vp1");
		ceo = new CEO("ceo1");
		executiveComitte = new ExecutiveCommitte("commitee1");
	}

	public void approve(PurchaseOrder po) {
		boolean res;
		if(seniorManager.approve(po)) return;
		if(director.approve(po)) return;
		if(vp.approve(po)) return;
		if(ceo.approve(po)) return;
		executiveComitte.approve(po);	
	}
	
	public static void main(String[] args) {
		int id = Integer.parseInt(args[0]);
		float amount = Float.parseFloat(args[1]);
		String description = args[2];
		Driver d = new Driver();
		PurchaseOrder po = new PurchaseOrder();
		po.setAmount(amount);
		po.setId(id);
		po.setDescription(description);
		d.approve(po);
	}

}
