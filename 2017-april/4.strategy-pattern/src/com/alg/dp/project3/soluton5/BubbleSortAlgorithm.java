package com.alg.dp.project3.soluton5;

public class BubbleSortAlgorithm implements ISortAlgorithm {
	private IComparator comparator;
	
	public BubbleSortAlgorithm(IComparator comparator) {
		this.comparator = comparator;
	}

	@Override
	public void sort() {
		System.out.println("Sort the array using bubble sort");

	}

}
