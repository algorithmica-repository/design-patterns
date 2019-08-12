package com.alg.oodesign.solution2;

public class Test {

	public static void main(String[] args) {
		int[] in = new int[100];
		IntegerSorter sorter = new BubbleIntegerrSorter();
		sorter.sort(in);
		sorter = new MergeIntegerSorter();
		sorter.sort(in);	

	}

}
