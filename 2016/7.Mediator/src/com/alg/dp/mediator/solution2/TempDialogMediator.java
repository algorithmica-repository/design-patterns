package com.alg.dp.mediator.solution2;

public class TempDialogMediator extends AbstractMediator {

	@Override
	void notify(IButton widget) {
		if(widget == fRaiseButton) {
			int val = fEditBox.getTemp() + 1;
			((TempBar)tempBar).setValue(val);
			fEditBox.setTemp(val);
			cEditBox.setTemp(Utils.convertFtoC(val));
		} else {
			System.out.println("Error");
		}
		
	}

	@Override
	public void notify(IEditBox widget) {
		if(widget == fEditBox) {
			cEditBox.setTemp(Utils.convertFtoC(widget.getTemp()));			
			((TempBar)tempBar).setValue(widget.getTemp());
		} else if(widget == cEditBox) {
			fEditBox.setTemp(Utils.convertCtoF(widget.getTemp()));
			((TempBar)tempBar).setValue(widget.getTemp());
		} else {
			System.out.println("Error");
		}
		
	}

	
}
