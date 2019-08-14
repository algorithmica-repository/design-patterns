package com.alg.oodesign.solution2;

public class FRaiseButton implements IButton {
	private IMediator mediator;
	
	public FRaiseButton(IMediator mediator) {
		super();
		this.mediator = mediator;
	}

	public void onClick() {
		System.out.println("Raise Button for Forenheit is pressed");
		mediator.notify(this);
	}
}
