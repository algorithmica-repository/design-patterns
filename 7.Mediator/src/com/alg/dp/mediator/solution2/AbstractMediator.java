package com.alg.dp.mediator.solution2;

public abstract class AbstractMediator {
	protected IEditBox fEditBox, cEditBox;
	protected IButton fRaiseButton;
	protected IWidget tempBar;

	public void setfEditBox(IEditBox fEditBox) {
		this.fEditBox = fEditBox;
	}


	public void setcEditBox(IEditBox cEditBox) {
		this.cEditBox = cEditBox;
	}


	public void setTempBar(IWidget tempBar) {
		this.tempBar = tempBar;
	}


	public void setfRaiseButton(IButton fRaiseButton) {
		this.fRaiseButton = fRaiseButton;
	}
	
	abstract void notify(IButton widget);
	abstract void notify(IEditBox widget);
}
