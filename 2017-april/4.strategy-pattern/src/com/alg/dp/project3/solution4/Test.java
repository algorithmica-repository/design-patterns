package com.alg.dp.project3.solution4;

public class Test {

	public static void main(String[] args) {
		int[] in = {10, 6, 7, 8, 3};
		Sorter sorter = new Sorter(in);
		
		ISortAlgorithm algo = new BubbleSortAlgorithm(); 
		sorter.setAlorithm(algo);
		sorter.sort();
		
		algo = new MergeSortAlgorithm();
		sorter.setAlorithm(algo);
		sorter.sort();
	}

}
