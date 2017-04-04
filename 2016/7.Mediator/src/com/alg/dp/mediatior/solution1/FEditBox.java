package com.alg.dp.mediatior.solution1;

public class FEditBox {
	private int tempf;
	private CEditBox cEditBox;
	private TempBar tempBar;
	
	public FEditBox() {
		super();
	}

	
	public void setTempf(int tempf) {
		this.tempf = tempf;
	}



	public void setcEditBox(CEditBox cEditBox) {
		this.cEditBox = cEditBox;
	}



	public void setTempBar(TempBar tempBar) {
		this.tempBar = tempBar;
	}



	public void setTemp(int tempf) {
		this.tempf = tempf;
	}
	
	public int getTemp() {
		return tempf;
	}
	
	public void changed() {
		cEditBox.setTemp(Utils.convertFtoC(tempf));
		tempBar.setValue(tempf);
	}


	@Override
	public String toString() {
		return "FEditBox [tempf=" + tempf + "]";
	}
	
	

}
