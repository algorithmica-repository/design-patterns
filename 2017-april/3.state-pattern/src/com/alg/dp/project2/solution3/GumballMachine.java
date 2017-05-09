package com.alg.dp.project2.solution3;

public class GumballMachine {
	private int ngumballs;
	private float money;	
	private IState state;	
	
	public GumballMachine() {
		ngumballs = 0;
		money = 0.0f;
		state = NoGumballsNoCoin.getInstance();
	}
	
	public GumballMachine(int count) {
		this();
		ngumballs = count;
		state = GumballsNoCoin.getInstance();
	}

	public void addGumballs(int count) {
		state.addGumballs(this, count);		
	}
	
	public void insertCoin() {
		state.insertCoin(this);
	}

	public void turnHandle() {
		state.turnHandle(this);
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
	
	public void updateState() {
		ngumballs -= 1;
		money += 1;
	}
	
	public int getNumGumballs() {
		return ngumballs;
	}
}
