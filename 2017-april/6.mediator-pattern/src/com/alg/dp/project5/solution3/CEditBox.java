package com.alg.dp.project5.solution3;

public class CEditBox implements IWidget {
	private TempDialogMediator mediator;
	private float tempInC;
	
	public CEditBox(TempDialogMediator mediator, float tempInC) {
		this.mediator = mediator;
		this.tempInC = tempInC;
	}

	public void change(float temp) {
		System.out.println("Edited value in Ceditbox:" + temp);
		mediator.notify(this, temp);
	}
	
	public void update(float temp) {
		tempInC = temp;
		System.out.println("CEditBox:" + tempInC);
	}

	public float getTemp() {
		return tempInC;
	}

	@Override
	public void change() {
		// TODO Auto-generated method stub
		
	}

	
}
