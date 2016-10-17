package com.alg.dp.cor.solution1;

public class Client {
	private AbstractRole sm, director, vp, ceo, ec;

	public Client() {
		
	}	
	
	public void setSm(AbstractRole sm) {
		this.sm = sm;
	}


	public void setDirector(AbstractRole director) {
		this.director = director;
	}


	public void setVp(AbstractRole vp) {
		this.vp = vp;
	}


	public void setCeo(AbstractRole ceo) {
		this.ceo = ceo;
	}


	public void setEc(AbstractRole ec) {
		this.ec = ec;
	}


	public void approveAmount(float amt) {
		if(amt < 1000)
			sm.approve(amt);
		else if(amt < 5000)
			director.approve(amt);
		else if(amt < 10000)
			vp.approve(amt);
		else if(amt < 50000)
			ceo.approve(amt);
		else
			ec.approve(amt);
	}
	
	public static void main(String[] args) {
		AbstractRole sm = new SeniorManager(1, 1000);
		AbstractRole director = new Director(2, 5000);
		AbstractRole vp = new VP(3, 10000);
		AbstractRole ceo = new CEO(4, 50000);
		AbstractRole ec = new ExecutiveComitte(5, 999999999);
		
		Client client = new Client();
		client.setSm(sm);
		client.setDirector(director);
		client.setVp(vp);
		client.setCeo(ceo);
		client.setEc(ec);
		
		client.approveAmount(51000);
		
	}

}
