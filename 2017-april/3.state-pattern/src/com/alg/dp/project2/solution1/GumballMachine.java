package com.alg.dp.project2.solution1;

public class GumballMachine {
	enum internal_state { 
		NO_GUMBALLS_NO_COIN,
		NO_GUMBALLS_COIN,
		GUMBALLS_COIN,
		GUMBALLS_NO_COIN
	}
	private int ngumballs;
	private float money;	
	private internal_state state;
	
	public GumballMachine() {
		ngumballs = 0;
		money = 0.0f;
		state = internal_state.NO_GUMBALLS_NO_COIN;
	}
	
	public GumballMachine(int count) {
		ngumballs = count;
		money = 0.0f;
		state = internal_state.GUMBALLS_NO_COIN;
	}

	public void addGumballs(int count) {
		ngumballs += count;
		System.out.println("Added "+ ngumballs);
		if(state == internal_state.NO_GUMBALLS_NO_COIN)
			state = internal_state.GUMBALLS_NO_COIN;
		else if(state == internal_state.NO_GUMBALLS_COIN)
			state = internal_state.GUMBALLS_COIN;
		
	}
	
	public void insertCoin() {
		if(state == internal_state.NO_GUMBALLS_NO_COIN) {
			state = internal_state.NO_GUMBALLS_COIN;
			System.out.println("Coin is inserted");
		}
		else if(state == internal_state.GUMBALLS_NO_COIN){
			state = internal_state.GUMBALLS_COIN;
			System.out.println("Coin is inserted");
		} else {
			System.out.println("Coin already inserted");
		}
	}

	public void turnHandle() {
		if(state == internal_state.GUMBALLS_COIN) {
			ngumballs -= 1;
			money += 1;
			if(ngumballs == 0)
				state = internal_state.NO_GUMBALLS_NO_COIN;
			else
				state = internal_state.GUMBALLS_NO_COIN;
			System.out.println("Take the gum ball");
		}
		else if(state == internal_state.NO_GUMBALLS_COIN){
			System.out.println("No gumballs exist. take out coin");
			state = internal_state.NO_GUMBALLS_NO_COIN;
		} else {
			System.out.println("Insert coin");
		}
	}

	@Override
	public String toString() {
		return "GumballMachine [ngumballs=" + ngumballs + ", money=" + money
				+ ", state=" + state + "]";
	}

	
	
}
