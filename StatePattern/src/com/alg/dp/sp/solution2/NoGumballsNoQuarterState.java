package com.alg.dp.sp.solution2;

public class NoGumballsNoQuarterState implements IState {
	private GumballMachine gumballMachine;
	

	public NoGumballsNoQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("Quarter is inserted");
		gumballMachine.setState(gumballMachine.noGumballsQuarter);	
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addGumballs(int count) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnHandle() {
		// TODO Auto-generated method stub
		
	}

	
}
