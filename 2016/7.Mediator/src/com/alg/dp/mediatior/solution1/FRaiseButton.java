package com.alg.dp.mediatior.solution1;

public class FRaiseButton {
	private FEditBox fEditBox;
	private CEditBox cEditBox;
	private TempBar tempBar;
	
	public FRaiseButton(FEditBox fEditBox, CEditBox cEditBox, TempBar tempBar) {
		super();
		this.fEditBox = fEditBox;
		this.cEditBox = cEditBox;
		this.tempBar = tempBar;
	}
	
	public void changed() {
		int tmp = fEditBox.getTemp() + 1;
		fEditBox.setTemp(tmp);
		cEditBox.setTemp(Utils.convertFtoC(tmp));
		tempBar.setValue(tmp);
	}
	

}
