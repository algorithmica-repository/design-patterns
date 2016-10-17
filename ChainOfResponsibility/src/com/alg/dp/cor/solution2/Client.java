package com.alg.dp.cor.solution2;

public class Client {
	private AbstractRole startrole;

	public Client(AbstractRole startRole) {
		this.startrole = startRole;
	}	
	
	public void approveAmount(float amt) {
		System.out.println(startrole.approve(amt));
	}
	
	public static void main(String[] args) {
		AbstractRole sm = new SeniorManager(1, 1000);
		AbstractRole director = new Director(2, 5000);
		AbstractRole vp = new VP(3, 10000);
		AbstractRole ceo = new CEO(4, 50000);
		AbstractRole ec = new ExecutiveComitte(5, 999999999);
		
		sm.setSuccessor(director);
		director.setSuccessor(vp);
		vp.setSuccessor(ceo);
		ceo.setSuccessor(ec);
		ec.setSuccessor(null);
		
		Client client = new Client(sm);		
		client.approveAmount(500);
		
	}

}
