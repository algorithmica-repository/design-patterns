package com.alg.dp.project6.solution4;

public class Driver {

	public static void main(String[] args) {
		CircleCookie ck1 = new CircleCookie();
		System.out.println(ck1.getCookieDetails());
		
		SquareCookie sq1 = new SquareCookie();
		System.out.println(sq1.getCookieDetails());
		
		ICookie ncircle = new NutsDecorator(new CircleCookie());
		System.out.println(ncircle.getCookieDetails());
		
		ICookie nsquare = new NutsDecorator(new SquareCookie());
		System.out.println(nsquare.getCookieDetails());
		
		ICookie scircle = new SprinklesDecorator(new CircleCookie());
		System.out.println( scircle.getCookieDetails());
		
		ICookie ssquare = new SprinklesDecorator(new SquareCookie());
		System.out.println(ssquare.getCookieDetails());
		
		ICookie snsquare = new SprinklesDecorator(new NutsDecorator(new SquareCookie()));
		System.out.println(snsquare.getCookieDetails());


	}

}
