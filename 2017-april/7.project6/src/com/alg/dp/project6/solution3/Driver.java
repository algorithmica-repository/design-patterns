package com.alg.dp.project6.solution3;

public class Driver {

	public static void main(String[] args) {
		CircleCookie ck1 = new CircleCookie();
		System.out.println(ck1.toString());
		
		SquareCookie sq1 = new SquareCookie();
		System.out.println(sq1.toString());
		
		AbstractCookie ncircle = new NutsDecorator(new CircleCookie());
		System.out.println(ncircle.toString());
		
		AbstractCookie nsquare = new NutsDecorator(new SquareCookie());
		System.out.println(nsquare.toString());
		
		AbstractCookie scircle = new SprinklesDecorator(new CircleCookie());
		System.out.println( scircle.toString());
		
		AbstractCookie ssquare = new SprinklesDecorator(new SquareCookie());
		System.out.println(ssquare.toString());
		
		AbstractCookie snsquare = new SprinklesDecorator(new NutsDecorator(new SquareCookie()));
		System.out.println(snsquare.toString());


	}

}
