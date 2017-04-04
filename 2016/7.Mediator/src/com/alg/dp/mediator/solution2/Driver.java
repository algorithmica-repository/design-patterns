package com.alg.dp.mediator.solution2;

public class Driver {

	public static void main(String[] args) {
		AbstractMediator mediator = new TempDialogMediator();
		
		IEditBox fEditBox = new FEditBox(mediator);
		IEditBox cEditBox = new CEditBox(mediator);
		IWidget tempBar = new TempBar(mediator);
		IButton fRaiseButton = new FRaiseButton(mediator);
		
		mediator.setcEditBox(cEditBox);
		mediator.setfEditBox(fEditBox);
		mediator.setfRaiseButton(fRaiseButton);
		mediator.setTempBar(tempBar);

		System.out.println(fEditBox + " " + cEditBox + " " + tempBar);
		fEditBox.setTemp(40);
		fEditBox.changed();
		System.out.println(fEditBox + " " + cEditBox + " " + tempBar);

		fRaiseButton.changed();
		System.out.println(fEditBox + " " + cEditBox + " " + tempBar);

	}

}
