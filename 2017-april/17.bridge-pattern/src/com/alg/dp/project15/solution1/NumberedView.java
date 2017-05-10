package com.alg.dp.project15.solution1;

import java.util.List;

public class NumberedView implements IViewStrategy {

	@Override
	public void formattedDisplay(List<Task> tasks) {
		int n = 0;
		for(Task task:tasks) {
			System.out.println((++n) + task.toString());
		}

	}

}
