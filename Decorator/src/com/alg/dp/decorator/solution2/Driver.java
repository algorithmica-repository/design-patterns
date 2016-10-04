package com.alg.dp.decorator.solution2;

public class Driver {


	public static void main(String[] args) {
		SquareCookie sc1 = new SquareCookie();
		System.out.println(sc1.getDescription());
		System.out.println(sc1.getCost());
		
		SquareCookie sc2 = new SquareCookie();
		sc2.setRequireNuts(true);
		System.out.println(sc2.getDescription());
		System.out.println(sc2.getCost());
	}

}
