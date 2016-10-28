package com.alg.dp.strategy.solution1;

public class Sorter {
	
	private int[] array;
	private String algorithm;
	
	public void setArray(int[] array) {
		this.array = array;
	}
	
	public void setAlgorithm(String algorithm) {
		this.algorithm = algorithm;
	}
	
	private void bubblesort() {
		System.out.println("array is sorted using bubblesort");
	}
	
	private void mergesort() {
		System.out.println("array is sorted using mergesort");
	}
	
	public void sort() {
		if(algorithm.equals("bubblesort"))
			bubblesort();
		else if(algorithm.equals("mergesort"))
			mergesort();
		else
			System.out.println("Invalid algorithm is provided");
	}
	

}
