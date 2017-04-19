package com.alg.dp.project5.solution2;

public class Driver {

	public static void main(String[] args) {
		TempDialogMediator mediator = new TempDialogMediator();
		TempBar tempBar = new TempBar();
		IEditBox fEditBox = new FEditBox(mediator, 0);
		IEditBox cEditBox = new CEditBox(mediator, 0);
		IButton frButton = new FRaiseButton(mediator);
		IButton flButton = new FLowerButton(mediator);
		IButton crButton = new CRaiseButton(mediator);
		IButton clButton = new CLowerButton(mediator);
		mediator.setcEditBox(cEditBox);
		mediator.setClButton(clButton);
		mediator.setCrButton(crButton);
		mediator.setfEditBox(fEditBox);
		mediator.setFlButton(flButton);
		mediator.setFrButton(frButton);
		mediator.setTempBar(tempBar);
		
		fEditBox.change(30);
		System.out.println();
		cEditBox.change(43);
		System.out.println();
		frButton.onClick();
		System.out.println();
		flButton.onClick();
	}

}
