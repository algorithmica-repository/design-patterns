package com.alg.dp.project2.solution2;

public class NoGumballsNoCoin implements IState {
	private GumballMachine gbm;
	
	public NoGumballsNoCoin(GumballMachine gbm) {
		this.gbm = gbm;
	}

	@Override
	public void addGumballs(int count) {
		gbm.addCount(count);
		gbm.setState(new GumballsNoCoin(gbm));
	}

	@Override
	public void insertCoin() {
		// TODO Auto-generated method stub

	}

	@Override
	public void turnHandle() {
		// TODO Auto-generated method stub

	}

}
