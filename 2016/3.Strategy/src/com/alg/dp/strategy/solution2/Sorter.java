package com.alg.dp.strategy.solution2;

public class Sorter {	
	private int[] array;
	private ISortAlgorithm algorithm;
	
	public void setArray(int[] array) {
		this.array = array;
	}
	
	public void setAlgorithm(ISortAlgorithm algorithm) {
		this.algorithm = algorithm;
	}
	
	public void sort() {
		algorithm.sort(array);
	}
	

}
