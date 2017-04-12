package com.alg.dp.project3.solution3;

public class Test {

	public static void main(String[] args) {
		int[] in = {10, 6, 7, 8, 3};
		Sorter sorter = new AscBubbleSorter(in);
		sorter.sort();
		sorter = new DescMergeSorter(in);
		sorter.sort();
	}

}
