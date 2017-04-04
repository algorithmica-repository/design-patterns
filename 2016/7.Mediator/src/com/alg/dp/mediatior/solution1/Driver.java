package com.alg.dp.mediatior.solution1;

public class Driver {

	public static void main(String[] args) {
		TempBar tempBar = new TempBar();
		FEditBox fEditBox = new FEditBox();
		CEditBox cEditBox = new CEditBox();
		fEditBox.setcEditBox(cEditBox);
		fEditBox.setTempBar(tempBar);
		cEditBox.setfEditBox(fEditBox);
		cEditBox.setTempBar(tempBar);
		
		FRaiseButton fRaiseButton = new FRaiseButton(fEditBox, cEditBox, tempBar);
		
		System.out.println(fEditBox + " " + cEditBox + " " + tempBar);
		fEditBox.setTemp(40);
		fEditBox.changed();
		System.out.println(fEditBox + " " + cEditBox + " " + tempBar);

		fRaiseButton.changed();
		System.out.println(fEditBox + " " + cEditBox + " " + tempBar);

	}

}
