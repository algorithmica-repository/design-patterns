package com.alg.dp.project2.solution2;

public class NoGumballsNoCoin implements IState {
	private GumballMachine gbm;
	
	public NoGumballsNoCoin(GumballMachine gbm) {
		this.gbm = gbm;
	}

	@Override
	public void addGumballs(int count) {
		System.out.println("Added gumballs");
		gbm.addCount(count);
		gbm.setState(gbm.getState("g_nc"));
	}

	@Override
	public void insertCoin() {
		System.out.println("Coin is inserted");
		gbm.setState(gbm.getState("ng_c"));
	}

	@Override
	public void turnHandle() {
		System.out.println("Insert coin");
	}

}
