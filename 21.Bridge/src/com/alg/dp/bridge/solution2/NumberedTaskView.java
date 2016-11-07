package com.alg.dp.bridge.solution2;

import java.util.List;

public class NumberedTaskView extends AbstractTaskView {

	@Override
	public void display() {
		List<Task> res = strategy.sort(tasks);
		int n = 1;
		for(Task task: res) {
			System.out.println(n + ":" + task);
			++n;
		}


	}

}
