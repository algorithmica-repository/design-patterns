package com.alg.dp.project15.solution1;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrioritybasedSortStrategy implements ISortStrategy {

	class PriorityComparator implements Comparator<Task> {

		@Override
		public int compare(Task t1, Task t2) {
			return t1.getPriority() - t2.getPriority();
		}
		
	}
	@Override
	public void sort(List<Task> tasks) {
		Collections.sort(tasks, new PriorityComparator());
	}

}
