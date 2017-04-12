package com.alg.dp.project3.solution2;

public class Test {

	public static void main(String[] args) {
		int[] in = {10, 6, 7, 8, 3};
		Sorter sorter = new BubbleSorter(in);
		sorter.sort();
		sorter = new MergeSorter(in);
		sorter.sort();
		sorter = new  QucikSort(in);
		sorter.sort();
	}

}
