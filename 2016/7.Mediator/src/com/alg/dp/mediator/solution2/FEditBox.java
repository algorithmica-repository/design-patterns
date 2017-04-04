package com.alg.dp.mediator.solution2;

public class FEditBox implements IEditBox {
	private int tempf;
	private AbstractMediator mediator;	
	
	public FEditBox(AbstractMediator mediator) {
		super();
		this.mediator = mediator;
	}
	
	public void setTemp(int tempf) {
		this.tempf = tempf;
	}
	
	public int getTemp() {
		return tempf;
	}
	
	public void changed() {
		mediator.notify(this);
	}

	@Override
	public String toString() {
		return "FEditBox [tempf=" + tempf + "]";
	}
	
	

}
