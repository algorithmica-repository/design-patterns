package com.alg.oodesign.solution4;

public class IntegerSorter {
	private ISortStrategy sortStrategy;
	private ICompareStrategy compareStrategy;

	public void setSortStrategy(ISortStrategy sortStrategy) {
		this.sortStrategy = sortStrategy;
	}

	public void setCompareStrategy(ICompareStrategy compareStrategy) {
		this.compareStrategy = compareStrategy;
	}

	public void sort(int[] in) {
		sortStrategy.sort(in, compareStrategy);
	}
}
