package com.alg.dp.project2.solution2;

public class GumballsCoin implements IState {
	private GumballMachine gbm;

	public GumballsCoin(GumballMachine gbm) {
		this.gbm = gbm;
	}
	
	@Override
	public void addGumballs(int count) {
		System.out.println("Added gumballs");
		gbm.addCount(count);
	}

	@Override
	public void insertCoin() {
		System.out.println("Coin already inserted");
	}

	@Override
	public void turnHandle() {
		gbm.updateState();
		if(gbm.getNumGumballs() == 0)
			gbm.setState(gbm.getState("ng_nc"));
		else
			gbm.setState(gbm.getState("g_nc"));
	}

}
