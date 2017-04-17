package com.alg.dp.project5.solution1;

public class CEditBox {
	private FEditBox fEditBox;
	private TempBar tempBar;
	private float tempInC;
	
	public CEditBox(TempBar tempBar, float tempInC) {
		super();
		this.tempBar = tempBar;
		this.tempInC = tempInC;
	}

	public void change(float temp) {
		System.out.println("Edited value in Ceditbox:" + temp);
		fEditBox.update(Utils.convertCF(temp));
		tempBar.display(Utils.convertCF(temp));
	}
	
	public void update(float temp) {
		tempInC = temp;
		System.out.println("CEditBox:" + tempInC);
	}

	public void setfEditBox(FEditBox fEditBox) {
		this.fEditBox = fEditBox;
	}
	
	
}
