package com.alg.dp.project15.solution1;

import java.util.List;

public class BulletView implements IViewStrategy {

	@Override
	public void formattedDisplay(List<Task> tasks) {
		for(Task task:tasks) {
			System.out.println("*" + task.toString());
		}

	}

}
