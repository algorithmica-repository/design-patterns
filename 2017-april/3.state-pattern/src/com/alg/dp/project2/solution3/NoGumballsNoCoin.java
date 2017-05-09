package com.alg.dp.project2.solution3;

public class NoGumballsNoCoin implements IState {
	private static NoGumballsNoCoin instance;
	
	private NoGumballsNoCoin() {
	}
	
	public static synchronized IState getInstance() {
		if(instance == null)
			instance = new NoGumballsNoCoin();
		return instance;
	}

	@Override
	public void addGumballs(GumballMachine gbm, int count) {
		System.out.println("Added gumballs");
		gbm.addCount(count);
		gbm.setState(GumballsNoCoin.getInstance());
	}

	@Override
	public void insertCoin(GumballMachine gbm) {
		System.out.println("Coin is inserted");
		gbm.setState(NoGumballsCoin.getInstance());
	}

	@Override
	public void turnHandle(GumballMachine gbm) {
		System.out.println("Insert coin");
	}

}
