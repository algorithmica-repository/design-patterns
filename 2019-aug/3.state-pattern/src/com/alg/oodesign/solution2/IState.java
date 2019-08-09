package com.alg.oodesign.solution2;

public interface IState {
	void addGumballs(GumballMachine gbm, int count);
	void insertCoin(GumballMachine gbm);
	void turnHandle(GumballMachine gbm);
}
