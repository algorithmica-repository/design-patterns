package com.alg.dp.bridge.solution2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DuedateSortStrategy implements ISort {

	class DuedateComparator implements Comparator<Task> {

		@Override
		public int compare(Task o1, Task o2) {
			return o1.getDuedate().compareTo(o2.getDuedate());
		}
		
	}
	
	@Override
	public List<Task> sort(List<Task> tasks) {
		List<Task> newlist = new ArrayList<Task>(tasks);
		Collections.sort(newlist, new DuedateComparator());
		return newlist;
	}
}
