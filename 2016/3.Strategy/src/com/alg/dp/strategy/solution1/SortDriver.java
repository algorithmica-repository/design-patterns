package com.alg.dp.strategy.solution1;

public class SortDriver {

	public static void main(String[] args) {
		int[] in = {10,5,8,15,1,3};
		
		Sorter sorter = new Sorter();
		sorter.setArray(in);
		sorter.setAlgorithm("bubblesort");
		sorter.sort();
		
		sorter.setAlgorithm("mergesort");
		sorter.sort();
	}

}
