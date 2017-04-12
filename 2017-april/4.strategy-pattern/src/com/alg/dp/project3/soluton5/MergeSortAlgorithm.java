package com.alg.dp.project3.soluton5;

public class MergeSortAlgorithm implements ISortAlgorithm {
	private IComparator comparator;
	
	public MergeSortAlgorithm(IComparator comparator) {
		this.comparator = comparator;
	}
	@Override
	public void sort() {
		System.out.println("Sort array using mergesort");

	}

}
