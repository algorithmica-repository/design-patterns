package com.alg.dp.decorator.solution1;

public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SquareCookie sc = new SquareCookie();
		System.out.println(sc.getDescription());
		System.out.println(sc.getCost());
		
		SquareNutsCookie snc = new SquareNutsCookie();
		System.out.println(snc.getDescription());
		System.out.println(snc.getCost());
	}

}
