package com.alg.oodesign.solution4;

public class Test {

	public static void main(String[] args) {
		int[] in = new int[100];
		IntegerSorter sorter = new IntegerSorter();
		sorter.setCompareStrategy(new AscCmpStrateggy() );
		sorter.setSortStrategy(new BubbleSortStrategy() );
		sorter.sort(in);
	}

}
