package com.alg.dp.bridge.solution2;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractTaskView {
	protected List<Task> tasks;
	protected ISort strategy;
	
	public AbstractTaskView() {
		tasks = new ArrayList<Task>();
	}
	public abstract void display();
	public void addTask(Task task) {
		tasks.add(task);
	}
	public void setStrategy(ISort strategy) {
		this.strategy = strategy;
	}
}
