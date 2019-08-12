package com.alg.oodesign.solution1;

public class IntegerSorter {

		public static void bubblesort(int[] in) {
			System.out.println("bubble sort");
		}
		public static void mergesort(int[] in) {
			System.out.println("merge sort");
		}
		public static void sort(int[] in, String algorithm) {
			if(algorithm.equals("bubblesort"))
				bubblesort(in);
			else if(algorithm.equals("mergesort"))
				mergesort(in);
			else 
				System.out.println("Invalid algorithm");
		}
}
