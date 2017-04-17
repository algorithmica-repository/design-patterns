package com.alg.dp.project5.solution2;

public class CRaiseButton implements IButton {
	private TempDialogMediator mediator;
	
	public CRaiseButton(TempDialogMediator mediator) {
		super();
		this.mediator = mediator;
	}

	public void onClick() {
		System.out.println("Raise Button for Celsius is pressed");
		mediator.notify(this);
	}	

}
