package com.alg.dp.project14.solution1;

public class Dummy {
	private SeniorManager seniorManager;
	private Director director;
	private VP vp;
	private CEO ceo;
	private ExecutiveCommitte executiveComitte;
	
	public Dummy() {
		seniorManager = new SeniorManager("seniormanager1");
		director = new Director("director1");
		vp = new VP("vp1");
		ceo = new CEO("ceo1");
		executiveComitte = new ExecutiveCommitte("commitee1");
	}

	public void approve(float amount) {
		boolean res;
		if(seniorManager.approve(amount)) return;
		if(director.approve(amount)) return;
		if(vp.approve(amount)) return;
		if(ceo.approve(amount)) return;
		executiveComitte.approve(amount);	
	}
	
	public static void main(String[] args) {
		float amount = Float.parseFloat(args[0]);
		Dummy d = new Dummy();
		d.approve(amount);
	}

}
