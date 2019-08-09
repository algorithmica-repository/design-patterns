package com.alg.oodesign.solution2;

public class GumballMachine {
	private int ngumballs;
	private int ncoins;
	private IState state;
	
	public GumballMachine() {
		ngumballs = 0;
		ncoins = 0;
		state = NoGumballsNoCoin.getInstance();
	}
	public void addGumballs(int count) {
		state.addGumballs(this, count);
	}
	public void insertCoin() {
		state.insertCoin(this);
	}
	public void turnHandle(){
		state.turnHandle(this);
	}
	public void addGumBalls(int count) {
		ngumballs += count;
	}
	public void addCoin() {
		++ncoins;
	}
	public void setState(IState state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "GumballMachine [ngumballs=" + ngumballs + ", ncoins=" + ncoins
				+ ", state=" + state + "]";
	}
	
}
