package com.alg.oodesign.solution2;

public class CLowerButton implements IButton {
	private IMediator mediator;
	
	public CLowerButton(IMediator mediator) {
		super();
		this.mediator = mediator;
	}

	public void onClick() {
		System.out.println("Lower Button for Celsius is pressed");
		mediator.notify(this);
	}
}
