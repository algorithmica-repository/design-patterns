package com.alg.dp.project6.solution2;

public class Driver {

	public static void main(String[] args) {
		CircleCookie ck1 = new CircleCookie();
		System.out.println(ck1.getCookieDetails());
		
		SquareCookie sk1 = new SquareCookie();
		System.out.println(sk1.getCookieDetails());
		
		CircleCookie ck2 = new CircleCookie();
		ck2.requireNuts(false);
		ck2.requireSprinkles(true, 10);
		System.out.println(ck2.getCookieDetails());
		
		SquareCookie sk2 = new SquareCookie();
		sk2.requireNuts(true, 5);
		sk2.requireSprinkles(true, 10);
		System.out.println(sk2.getCookieDetails());

	}

}
