package com.alg.dp.project5.solution3;

public class Driver {

	public static void main(String[] args) {
		TempDialogMediator mediator = new TempDialogMediator();
		
		TempBar tempBar = new TempBar();
		mediator.addWidget(tempBar);
		IWidget fEditBox = new FEditBox(mediator, 0);
		mediator.addWidget(fEditBox);
		CEditBox cEditBox = new CEditBox(mediator, 0);
		mediator.addWidget(cEditBox);			
		IWidget fRaiseButton = new FRaiseButton(mediator);
		IWidget  fLowerButton = new FLowerButton(mediator);
		IWidget  cRaiseButton = new CRaiseButton(mediator);
		IWidget  cLowerButton = new CLowerButton(mediator);
		mediator.addWidget(fRaiseButton);
		mediator.addWidget(fLowerButton);
		mediator.addWidget(cRaiseButton);
		mediator.addWidget(cLowerButton);
	
		fEditBox.change(30);
		System.out.println();
		cEditBox.change(43);
		System.out.println();
		fRaiseButton.change();
		System.out.println();
		fLowerButton.change();
	}

}
