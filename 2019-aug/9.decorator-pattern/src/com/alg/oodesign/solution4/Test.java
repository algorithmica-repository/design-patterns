package com.alg.oodesign.solution4;

public class Test {

	public static void main(String[] args) {
		SquareCookie s1 = new SquareCookie("100", 10);
		System.out.println(s1.getDetails());
		NutsDecorator nd1 = new NutsDecorator(2);
		s1.addDecorator(nd1);
		System.out.println(s1.getDetails());
		SprinklesDecorator sd1 = new SprinklesDecorator(0.2f);
		s1.addDecorator(sd1);
		System.out.println(s1.getDetails());
		
		CircleCookie c1 = new CircleCookie("200", 10);
		System.out.println(c1.getDetails());
				
	}

}
