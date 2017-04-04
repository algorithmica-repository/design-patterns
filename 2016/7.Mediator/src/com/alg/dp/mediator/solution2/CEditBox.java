package com.alg.dp.mediator.solution2;

public class CEditBox implements IEditBox {
	private int tempc;
	private AbstractMediator mediator;	
	
	public CEditBox(AbstractMediator mediator) {
		super();
		this.mediator = mediator;
	}

	public void setTemp(int tempc) {
		this.tempc = tempc;
	}
	
	public int getTemp() {
		return tempc;
	}
	
	public void changed() {
		mediator.notify(this);
	}

	@Override
	public String toString() {
		return "CEditBox [tempc=" + tempc + "]";
	}

	

}
