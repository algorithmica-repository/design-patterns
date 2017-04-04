package com.alg.dp.decorator.solution3;

public class Driver {


	public static void main(String[] args) {
		SquareCookie sc1 = new SquareCookie();
		System.out.println(sc1.getDescription());
		System.out.println(sc1.getCost());
		
		NutsDecorator nd1 = new NutsDecorator(new SquareCookie());
		System.out.println(nd1.getDescription());
		System.out.println(nd1.getCost());
		
		//NutsDecorator object is not considered as othr cookie type
		NutsDecorator nd2 = new NutsDecorator(new CircleCookie());
		System.out.println(nd2.getDescription());
		System.out.println(nd2.getCost());
		
		/*NutsDecorator nd2 = new SprinklesDecorator(new NutsDecorator(new CircleCookie()));
		System.out.println(nd2.getDescription());
		System.out.println(nd2.getCost());*/
	}

}
