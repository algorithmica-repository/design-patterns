package com.alg.dp.project3.soluton5;

public class Test {

	public static void main(String[] args) {
		int[] in = {10, 6, 7, 8, 3};
		Sorter sorter = new Sorter(in);
		
		IComparator comparator = new AscComparator();
		ISortAlgorithm algo = new BubbleSortAlgorithm(comparator); 
		sorter.setAlorithm(algo);
		sorter.sort();
		
		algo = new MergeSortAlgorithm(comparator);
		sorter.setAlorithm(algo);
		sorter.sort();
	}

}
