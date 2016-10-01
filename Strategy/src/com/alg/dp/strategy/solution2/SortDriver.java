package com.alg.dp.strategy.solution2;

public class SortDriver {

	public static void main(String[] args) {
		int[] in = {10,5,8,15,1,3};
		
		Sorter sorter = new Sorter();
		sorter.setArray(in);
		sorter.setAlgorithm(new BubbleSortingAlgorithm());
		sorter.sort();
		
		sorter.setAlgorithm(new MergeSortAlgorithm());
		sorter.sort();
		
		sorter.setAlgorithm(new QuickSortAlgorithm());
		sorter.sort();
	}

}
