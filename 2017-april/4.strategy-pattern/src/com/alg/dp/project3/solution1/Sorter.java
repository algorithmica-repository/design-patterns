package com.alg.dp.project3.solution1;

public class Sorter {
	private int[] array;
	
	public Sorter(int[] in) {
		array = in;
	}	             
	
	private void bubble_sort() {
		System.out.println("sorting array using bubble sort algorithm");
	}
	
	private void merge_sort() {
		System.out.println("sorting array using merge sort algorithm");
	}
	
	public void sort(String algo) {
		if(algo.equals("bubble_sort"))
			bubble_sort();
		else if(algo.equals("merge_sort"))
			merge_sort();
		else
			System.out.println("invalid sort algorithm");		
	}

}
