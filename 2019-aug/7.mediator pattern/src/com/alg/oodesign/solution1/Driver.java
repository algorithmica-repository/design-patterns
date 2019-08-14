package com.alg.oodesign.solution1;

public class Driver {

	public static void main(String[] args) {
		TempBar tempBar = new TempBar();
		FEditBox fEditBox = new FEditBox(tempBar, 0);
		CEditBox cEditBox = new CEditBox(tempBar, 0);
		fEditBox.setcEditBox(cEditBox);
		cEditBox.setfEditBox(fEditBox);				
		FRaiseButton fRaiseButton = new FRaiseButton(fEditBox, cEditBox, tempBar);
		FLowerButton fLowerButton = new FLowerButton(fEditBox, cEditBox, tempBar);
		
		fEditBox.change(30);
		System.out.println();
		cEditBox.change(43);
		System.out.println();
		fRaiseButton.onClick();
		System.out.println();
		fLowerButton.onClick();
	}

}
