package com.alg.dp.project5.solution2;

public class CLowerButton implements IButton {
	private TempDialogMediator mediator;
	
	public CLowerButton(TempDialogMediator mediator) {
		super();
		this.mediator = mediator;
	}

	public void onClick() {
		System.out.println("Lower Button for Celsius is pressed");
		mediator.notify(this);
	}
}
