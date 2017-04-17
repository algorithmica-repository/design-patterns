package com.alg.dp.project5.solution2;

public class FLowerButton implements IButton {
	private TempDialogMediator mediator;
	
	public FLowerButton(TempDialogMediator mediator) {
		super();
		this.mediator = mediator;
	}

	public void onClick() {
		System.out.println("Lower Button for Forenheit is pressed");
		mediator.notify(this);
	}
}
