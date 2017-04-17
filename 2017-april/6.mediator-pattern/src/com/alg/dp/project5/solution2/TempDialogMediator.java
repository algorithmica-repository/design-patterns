package com.alg.dp.project5.solution2;

public class TempDialogMediator {
	private IEditBox fEditBox;
	private IEditBox cEditBox;
	private TempBar tempBar;
	private IButton frButton;
	private IButton flButton;
	private IButton crButton;
	private IButton clButton;
	
	public TempDialogMediator(IEditBox fEditBox, IEditBox cEditBox,
			TempBar tempBar, IButton frButton, IButton flButton,
			IButton crButton, IButton clButton) {
		super();
		this.fEditBox = fEditBox;
		this.cEditBox = cEditBox;
		this.tempBar = tempBar;
		this.frButton = frButton;
		this.flButton = flButton;
		this.crButton = crButton;
		this.clButton = clButton;
	}
	
	public void notify(IEditBox editbox, float temp) {
		if(editbox == fEditBox) {
			cEditBox.update(temp);
			tempBar.display(temp);
		} else {
			fEditBox.update(temp);
			tempBar.display(temp);
		}		
	}
	
	public void notify(IButton button) {
		if(button == frButton) {
			float tmp = fEditBox.getTemp() + 5;
			fEditBox.update(tmp);
			cEditBox.update(Utils.convertFC(tmp));
			tempBar.display(tmp);
		} else if(button == crButton) {
			float tmp = cEditBox.getTemp() + 5;
			fEditBox.update(Utils.convertCF(tmp));
			cEditBox.update(tmp);
			tempBar.display(tmp);
		} else if(button == flButton) {
			float tmp = fEditBox.getTemp() - 5;
			fEditBox.update(tmp);
			cEditBox.update(Utils.convertFC(tmp));
			tempBar.display(tmp);
		} else {
			float tmp = cEditBox.getTemp() - 5;
			fEditBox.update(Utils.convertCF(tmp));
			cEditBox.update(tmp);
			tempBar.display(tmp);
		}
		
	}
	
}
