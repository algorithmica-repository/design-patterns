package com.alg.oodesign.solution2;

public class GumballsCoin implements IState {
	private static GumballsCoin instance = null;
	
	private GumballsCoin() {
		
	}
	public static IState getInstance() {
		if(instance == null)
			instance = new GumballsCoin();
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
