package com.alg.oodesign.solution1;

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

	public void onClick() {
		System.out.println("Raise Button for Forenheit is pressed");
		float f = fEditBox.getTempInF() + 5;
		fEditBox.update(f);
		cEditBox.update(Utils.convertFC(f));
		tempBar.display(f);
	}
}
