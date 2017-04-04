package com.alg.dp.strategy.soluton3;

public class Sorter {	
	private int[] array;
	private ISortAlgorithm algorithm;
	private IComparator comparator;	
	
	public Sorter() {
		algorithm = new BubbleSortingAlgorithm();
		comparator = new AscendingComparator();
	}

	public void setArray(int[] array) {
		this.array = array;
	}
	
	public void setAlgorithm(ISortAlgorithm algorithm) {
		this.algorithm = algorithm;
	}	
	
	public void setComparator(IComparator comparator) {
		this.comparator = comparator;
	}

	public void sort() {
		algorithm.sort(array, comparator);
	}
	

}
