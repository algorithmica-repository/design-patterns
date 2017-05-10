package com.alg.dp.project15.solution2;

import java.util.List;

public class BulletView extends AbstractView {

	public BulletView(List<Task> tasks) {
		super(tasks);
	}
	@Override
	public void formattedDisplay() {
		for(Task task:tasks) {
			System.out.println("*" + task.toString());
		}

	}

}
