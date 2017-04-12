package com.alg.dp.project3.solution2;

public abstract class Sorter {
	private int[] array;
	
	public Sorter(int[] in) {
		array = in;
	}
	
	public abstract void sort();
}
