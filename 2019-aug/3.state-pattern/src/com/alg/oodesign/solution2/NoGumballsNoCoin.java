package com.alg.oodesign.solution2;

public class NoGumballsNoCoin implements IState {
	private static NoGumballsNoCoin instance = null;
	
	private NoGumballsNoCoin() {
		
	}
	public static IState getInstance() {
		if(instance == null)
			instance = new NoGumballsNoCoin();
		return instance;
	}
	@Override
	public void addGumballs(GumballMachine gbm, int count) {
		gbm.addGumballs(count);
		gbm.setState(GumballsNoCoin.getInstance());
	}
	@Override
	public void insertCoin(GumballMachine gbm) {
		gbm.setState(NoGumballsCoin.getInstance());		
	}
	@Override
	public void turnHandle(GumballMachine gbm) {
		System.out.println("Insert coin");		
	}
	
}
