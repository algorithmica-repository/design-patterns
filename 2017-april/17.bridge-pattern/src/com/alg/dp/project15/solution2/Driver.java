package com.alg.dp.project15.solution2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		List<Task> tasks = new ArrayList<Task>();
		tasks.add(new Task("task1", new Date(), 3));
		tasks.add(new Task("task2", new Date(), 2));
		tasks.add(new Task("task3", new Date(), 4));
		
		AbstractView todolist = new ListView(tasks);
		todolist.setSortStrategy(new PrioritybasedSortStrategy());
		todolist.display();
		todolist = new NumberedView(tasks);
		todolist.display();
	}

}
