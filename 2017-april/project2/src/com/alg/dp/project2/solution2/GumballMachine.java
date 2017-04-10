package com.alg.dp.project2.solution2;

public class GumballMachine {
	private int ngumballs;
	private float money;	
	private IState state;
	
	public GumballMachine() {
		ngumballs = 0;
		money = 0.0f;
		state = new NoGumballsNoCoin(this);
	}
	
	public GumballMachine(int count) {
		ngumballs = count;
		money = 0.0f;
		state = new GumballsNoCoin(this);
	}

	public void addGumballs(int count) {
		state.addGumballs(count);		
	}
	
	public void insertCoin() {
		state.insertCoin();
	}

	public void turnHandle() {
		state.turnHandle();
	}

	@Override
	public String toString() {
		return "GumballMachine [ngumballs=" + ngumballs + ", money=" + money
				+ ", state=" + state + "]";
	}

	public void addCount(int count) {
		ngumballs += count;
	}
	
	public void setState(IState state) {
		this.state = state;
	}
}
