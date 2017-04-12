package com.alg.dp.project3.solution1;

public class Test {

	public static void main(String[] args) {
		int[] in = {10, 6, 7, 8, 3};
		Sorter sorter = new Sorter(in);
		sorter.sort("bubble_sort");
		sorter.sort("merge_sort");
	}

}
