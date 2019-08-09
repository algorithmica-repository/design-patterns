package com.alg.oodesign.solution2;

public class NoGumballsCoin implements IState {
	private static NoGumballsCoin instance = null;
	
	private NoGumballsCoin() {
		
	}
	public static IState getInstance() {
		if(instance == null)
			instance = new NoGumballsCoin();
		return instance;
	}
	@Override
	public void addGumballs(GumballMachine gbm, int count) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertCoin(GumballMachine gbm) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnHandle(GumballMachine gbm) {
		// TODO Auto-generated method stub
		
	}

	
}
