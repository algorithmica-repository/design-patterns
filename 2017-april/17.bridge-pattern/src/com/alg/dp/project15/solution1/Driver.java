package com.alg.dp.project15.solution1;

import java.util.Date;

public class Driver {

	public static void main(String[] args) {
		TODOList todolist = new TODOList();
		todolist.addTask(new Task("task1", new Date(), 3));
		todolist.addTask(new Task("task2", new Date(), 2));
		todolist.addTask(new Task("task3", new Date(), 4));
		todolist.setSortStrategy(new PrioritybasedSortStrategy());
		todolist.setViewStrategy(new ListView());
		todolist.display();
		todolist.setViewStrategy(new NumberedView());
		todolist.display();
	}

}
