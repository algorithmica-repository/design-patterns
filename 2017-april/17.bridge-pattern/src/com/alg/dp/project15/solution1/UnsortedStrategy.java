package com.alg.dp.project15.solution1;

import java.util.Collections;
import java.util.List;

public class UnsortedStrategy implements ISortStrategy {

	@Override
	public void sort(List<Task> tasks) {
		Collections.shuffle(tasks);
	}

}
