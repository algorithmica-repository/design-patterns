package com.alg.dp.project15.solution1;

import java.util.ArrayList;
import java.util.List;

public class TODOList {
	private List<Task> tasks;
	private ISortStrategy sortStrategy;
	private IViewStrategy viewStrategy;
	
	public TODOList() {
		tasks = new ArrayList<Task>();
	}
	
	public void addTask(Task task) {
		tasks.add(task);
	}

	public void setSortStrategy(ISortStrategy sortStrategy) {
		this.sortStrategy = sortStrategy;
	}

	public void setViewStrategy(IViewStrategy viewStrategy) {
		this.viewStrategy = viewStrategy;
	}
	
	public void display() {
		sortStrategy.sort(tasks);
		viewStrategy.formattedDisplay(tasks);
	}
	

}
