package com.alg.oodesign.solution3;

public class Test {

	public static void main(String[] args) {
		int[] in = new int[100];
		IntegerSorter sorter = new AscBubbleIntegerrSorter();
		sorter.sort(in);
		sorter = new AscMergeIntegerSorter();
		sorter.sort(in);	

	}

}
