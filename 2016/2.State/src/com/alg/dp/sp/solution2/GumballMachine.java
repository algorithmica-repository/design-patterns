package com.alg.dp.sp.solution2;

public class GumballMachine {
	private int gumballs;
	private float money;
	private IState state;
	
	public IState noGumballsNoQuarter;
	public IState gumballsNoQuarter;
	public IState noGumballsQuarter;
	public IState gumballsQuarter;
	
		
	public GumballMachine() {
		noGumballsNoQuarter = new NoGumballsNoQuarterState(this);
		gumballsNoQuarter = new GumballsNoQuarterState(this);
		noGumballsQuarter = new NoGumballsQuarterState(this);
		gumballsQuarter = new GumballsQuarterState(this);
		state = noGumballsNoQuarter;
	}
	
	public void setState(IState state) {
		this.state = state;
	}
	
	public void insertQuarter() {
		state.insertQuarter();
	}
	
	public void ejectQuarter() {
		state.ejectQuarter();
	}
	
	public void turnHandle() {
		state.turnHandle();
	}
	
	public void addGumballs(int count) {
		state.addGumballs(count);
	}
	
	public String toString() { 
		return "Gumballs:" + gumballs + "\nMoney:" + money;
	}

}
