package com.alg.dp.project2.solution3;

public class GumballsCoin implements IState {
	private static GumballsCoin instance;
	
	private GumballsCoin() {
	}
	
	public static synchronized IState getInstance() {
		if(instance == null)
			instance = new GumballsCoin();
		return instance;
	}
	@Override
	public void addGumballs(GumballMachine gbm, int count) {
		System.out.println("Added gumballs");
		gbm.addCount(count);
	}

	@Override
	public void insertCoin(GumballMachine gbm) {
		System.out.println("Coin already inserted");
	}

	@Override
	public void turnHandle(GumballMachine gbm) {
		gbm.updateState();
		if(gbm.getNumGumballs() == 0)
			gbm.setState(NoGumballsNoCoin.getInstance());
		else
			gbm.setState(GumballsNoCoin.getInstance());
	}

}
