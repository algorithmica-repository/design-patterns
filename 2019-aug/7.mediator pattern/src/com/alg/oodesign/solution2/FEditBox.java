package com.alg.oodesign.solution2;

public class FEditBox implements IEditBox {
	private IMediator mediator;
	private float tempInF;
	
	public FEditBox(IMediator mediator, float tempInF) {
		this.mediator = mediator;
		this.tempInF = tempInF;
	}

	public void change(float temp) {
		System.out.println("Edited value in Feditbox:" + temp);
		mediator.notify(this, temp);
	}
	
	public void update(float temp) {
		tempInF = temp;
		System.out.println("FEditbox:" + tempInF);
	}
	
	public float getTemp() {
		return tempInF;
	}
	
}
