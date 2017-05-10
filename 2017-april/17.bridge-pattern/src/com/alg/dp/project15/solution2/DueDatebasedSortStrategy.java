package com.alg.dp.project15.solution2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DueDatebasedSortStrategy implements ISortStrategy {

	class DueDateComparator implements Comparator<Task> {

		@Override
		public int compare(Task t1, Task t2) {
			return t1.getDuedate().compareTo(t2.getDuedate());
		}
		
	}
	@Override
	public void sort(List<Task> tasks) {
		Collections.sort(tasks, new DueDateComparator());
	}

}
