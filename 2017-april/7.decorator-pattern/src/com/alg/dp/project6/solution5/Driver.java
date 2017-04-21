package com.alg.dp.project6.solution5;

public class Driver {

	public static void main(String[] args) {
		CircleCookie ck1 = new CircleCookie();
		System.out.println(ck1.getCookieDetails());
		
		SquareCookie sq1 = new SquareCookie();
		System.out.println(sq1.getCookieDetails());
		
		ICookie ncircle = new CircleCookie();
		ncircle.addDecorator(new NutsDecorator());
		System.out.println(ncircle.getCookieDetails());
		
		ICookie nsquare = new SquareCookie();
		nsquare.addDecorator(new NutsDecorator());
		System.out.println(nsquare.getCookieDetails());
		
		ICookie snsquare = new SquareCookie(); 
		snsquare.addDecorator(new NutsDecorator());
		snsquare.addDecorator(new SprinklesDecorator());
		System.out.println(snsquare.getCookieDetails());
	}

}

//New API for decorators could not supported