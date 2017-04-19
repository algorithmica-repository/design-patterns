package com.alg.dp.project5.solution2;

public class CEditBox implements IEditBox {
	private IMediator mediator;
	private float tempInC;
	
	public CEditBox(IMediator mediator, float tempInC) {
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
	
}
