package com.alg.dp.bridge.solution2;

import java.util.List;

public class ListTaskView extends AbstractTaskView {

	@Override
	public void display() {
		List<Task> res = strategy.sort(tasks);
		for(Task task: res) {
			System.out.println(task);
		}
	}

}
