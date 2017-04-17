package com.alg.dp.project5.solution3;

public class CLowerButton implements IWidget {
	private TempDialogMediator mediator;
	
	public CLowerButton(TempDialogMediator mediator) {
		super();
		this.mediator = mediator;
	}

	public void change() {
		System.out.println("Lower Button for Celsius is pressed");
		mediator.notify();
	}

	@Override
	public void update(float temp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void change(float temp) {
		// TODO Auto-generated method stub
		
	}
}
