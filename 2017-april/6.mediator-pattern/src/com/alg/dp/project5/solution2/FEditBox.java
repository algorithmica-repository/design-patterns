package com.alg.dp.project5.solution2;

public class FEditBox implements IEditBox {
	private TempDialogMediator mediator;
	private float tempInF;
	
	public FEditBox(TempDialogMediator mediator, float tempInF) {
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
