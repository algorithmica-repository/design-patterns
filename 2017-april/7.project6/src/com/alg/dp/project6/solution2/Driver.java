package com.alg.dp.project6.solution2;

public class Driver {

	public static void main(String[] args) {
		CircleCookie ck1 = new CircleCookie();
		System.out.println(ck1.toString());
		
		SquareCookie sq1 = new SquareCookie();
		System.out.println(sq1.toString());
		
		NutsDecorator ncircle = new NutsDecorator(new CircleCookie());
		System.out.println(ncircle.toString());
		
		NutsDecorator nsquare = new NutsDecorator(new SquareCookie());
		System.out.println(nsquare.toString());
		
		SprinklesDecorator scircle = new SprinklesDecorator(new CircleCookie());
		System.out.println( scircle.toString());
		
		SprinklesDecorator ssquare = new SprinklesDecorator(new SquareCookie());
		System.out.println(ssquare.toString());
		
		//chaining of decorators  not possible
		//SprinklesDecorator ssquare = new SprinklesDecorator(new NutsDecorator(new SquareCookie()));
		//System.out.println(ssquare.toString());


	}

}
