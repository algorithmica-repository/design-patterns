package com.alg.dp.mediatior.solution1;

public class CEditBox {
	private int tempc;
	private FEditBox fEditBox;
	private TempBar tempBar;
	
	
	public CEditBox() {
		super();
	}

	public void setTempc(int tempc) {
		this.tempc = tempc;
	}

	public void setfEditBox(FEditBox fEditBox) {
		this.fEditBox = fEditBox;
	}

	public void setTempBar(TempBar tempBar) {
		this.tempBar = tempBar;
	}

	public CEditBox(FEditBox fEditBox, TempBar tempBar) {
		super();
		this.fEditBox = fEditBox;
		this.tempBar = tempBar;
	}

	public void setTemp(int tempc) {
		this.tempc = tempc;
	}
	
	public int getTemp() {
		return tempc;
	}
	
	public void changed() {
		fEditBox.setTemp(Utils.convertCtoF(tempc));
		tempBar.setValue(tempc);
	}

	@Override
	public String toString() {
		return "CEditBox [tempc=" + tempc + "]";
	}

	

}
