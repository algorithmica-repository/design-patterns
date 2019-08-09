package com.alg.oodesign.solution1;

public class GumballMachine {
	enum machine_state {
		NOGUMBALLS_NOCOIN,
		NOGUMBALLS_COIN,
		GUMBALLS_NOCOIN,
		GUMBALLS_COIN
	}
	private int ngumballs;
	private int ncoins;
	private machine_state state;
	
	public GumballMachine() {
		ngumballs = 0;
		ncoins = 0;
		state = machine_state.NOGUMBALLS_NOCOIN;
	}
	public void addGumballs(int count) {
		ngumballs += count;
		state = machine_state.GUMBALLS_NOCOIN;
	}
	public void insertCoin() {
		if(state == machine_state.NOGUMBALLS_NOCOIN)
			state = machine_state.NOGUMBALLS_COIN;
		else if(state == machine_state.GUMBALLS_NOCOIN)
			state = machine_state.GUMBALLS_COIN;
		else {
			System.out.println("Coin already inserted. Turn handle");
		}		
	}
	public void turnHandle(){
		if(state == machine_state.NOGUMBALLS_NOCOIN || state == machine_state.GUMBALLS_NOCOIN)
			System.out.println("Insert Coin");
		else if(state == machine_state.NOGUMBALLS_COIN)
			System.out.println("No gumballs exist. Take coin back");
		else {
			--ngumballs;
			++ncoins;
			System.out.println("Take gumball");
			if(ngumballs == 0)
				state = machine_state.NOGUMBALLS_NOCOIN;
			else
				state = machine_state.GUMBALLS_NOCOIN;
		}
	}
	@Override
	public String toString() {
		return "GumballMachine [ngumballs=" + ngumballs + ", ncoins=" + ncoins
				+ ", state=" + state + "]";
	}
	
	
}
