package com.alg.dp.mediator.solution2;

public class TempBar implements IWidget {
	private int value;
	private AbstractMediator mediator;

	public TempBar(AbstractMediator mediator) {
		this.mediator = mediator;
	}
	
	public int getValue() {
		return value;
	}


	@Override
	public void changed() {
		// TODO Auto-generated method stub
		
	}


	public void setValue(int value) {
		this.value = value;
	}


	@Override
	public String toString() {
		return "TempBar [value=" + value + "]";
	}

	

}
