package com.alg.dp.project15.solution2;

import java.util.List;


public class NumberedView extends AbstractView {

	public NumberedView(List<Task> tasks) {
		super(tasks);
	}
	public void formattedDisplay() {
		int n = 0;
		for(Task task:tasks) {
			System.out.println((++n) + task.toString());
		}

	}

}
