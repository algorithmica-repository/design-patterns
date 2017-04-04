package com.alg.dp.bridge.solution2;

import java.util.Date;

public class Driver {

	public static void test(AbstractTaskView taskview, ISort strategy) {
		taskview.setStrategy(strategy);
		taskview.addTask(new Task("assignment completion", new Date(2016, 11, 20), 1));
		taskview.addTask(new Task("project completion", new Date(2016, 12, 20), 2));
		taskview.addTask(new Task("code completion", new Date(2016, 12, 31), 3));
		taskview.addTask(new Task("project submission", new Date(2016, 11, 31), 2));
		taskview.display();
	}
	public static void main(String[] args) {
		test(new ListTaskView(), new UnorderedStrategy());
		System.out.println();
		test(new ListTaskView(), new PrioritySortStrategy());
		System.out.println();
		test(new NumberedTaskView(), new UnorderedStrategy());
		System.out.println();
		test(new NumberedTaskView(), new DuedateSortStrategy());
	}

}
