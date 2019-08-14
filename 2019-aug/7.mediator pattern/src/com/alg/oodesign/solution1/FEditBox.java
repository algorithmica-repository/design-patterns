package com.alg.oodesign.solution1;

public class FEditBox {
	private CEditBox cEditBox;
	private TempBar tempBar;
	private float tempInF;
	
	public FEditBox(TempBar tempBar, float tempInF) {
		this.tempBar = tempBar;
		this.tempInF = tempInF;
	}

	public void change(float temp) {
		System.out.println("Edited value in Feditbox:" + temp);
		cEditBox.update(Utils.convertFC(temp));
		tempBar.display(temp);
	}
	
	public void update(float temp) {
		tempInF = temp;
		System.out.println("FEditbox:" + tempInF);
	}
	
	public float getTempInF() {
		return tempInF;
	}

	public void setcEditBox(CEditBox cEditBox) {
		this.cEditBox = cEditBox;
	}
	
}
