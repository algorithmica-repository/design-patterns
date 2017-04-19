package com.alg.dp.project5.solution2;

public class FLowerButton implements IButton {
	private IMediator mediator;
	
	public FLowerButton(IMediator mediator) {
		super();
		this.mediator = mediator;
	}

	public void onClick() {
		System.out.println("Lower Button for Forenheit is pressed");
		mediator.notify(this);
	}
}
