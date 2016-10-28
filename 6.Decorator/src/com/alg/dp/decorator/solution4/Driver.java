package com.alg.dp.decorator.solution4;

public class Driver {


	public static void main(String[] args) {
		AbstractCookie sc1 = new SquareCookie();
		System.out.println(sc1.getDescription());
		System.out.println(sc1.getCost());
		
		AbstractCookie sc2 = new NutsDecorator(new SquareCookie());
		System.out.println(sc2.getDescription());
		System.out.println(sc2.getCost());
		
		//NutsDecorator object is not considered as othr cookie type
		AbstractCookie sc3 = new NutsDecorator(new CircleCookie());
		System.out.println(sc3.getDescription());
		System.out.println(sc3.getCost());
		
		AbstractCookie sc4 = new SprinklesDecorator(new NutsDecorator(new CircleCookie()));
		System.out.println(sc4.getDescription());
		System.out.println(sc4.getCost());
	}

}
