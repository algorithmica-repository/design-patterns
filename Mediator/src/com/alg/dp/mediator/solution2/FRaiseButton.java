package com.alg.dp.mediator.solution2;

public class FRaiseButton implements IButton {
	private AbstractMediator mediator;
	
	public FRaiseButton(AbstractMediator mediator) {
		this.mediator = mediator;
	}
	
	public void changed() {
		mediator.notify(this);
	}
	

}
