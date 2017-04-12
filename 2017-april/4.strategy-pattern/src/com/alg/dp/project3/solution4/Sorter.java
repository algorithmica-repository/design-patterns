package com.alg.dp.project3.solution4;


public class Sorter {
	private int[] array;
	private ISortAlgorithm algo;
	
	public Sorter(int[] in) {
		array = in;
	}             
	
	public void setAlorithm(ISortAlgorithm algo) {
		this.algo = algo;
	}
	public void sort() {
		algo.sort();
	}

}
