package com.alg.dp.project2.solution3;

public interface IState {
	void addGumballs(GumballMachine gbm, int count);
	void insertCoin(GumballMachine gbm);
	void turnHandle(GumballMachine gbm);
}
