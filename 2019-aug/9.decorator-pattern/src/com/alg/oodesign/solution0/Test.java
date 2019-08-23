package com.alg.oodesign.solution0;

public class Test {

	public static void main(String[] args) {
		SquareCookie s1 = new SquareCookie("100", 10, 0, 0.2f);
		System.out.println(s1.getDetails());
		
		SquareCookie s2 = new SquareCookie("100", 10, 3, 0.0f);
		System.out.println(s2.getDetails());
		
		CircleCookie c1 = new CircleCookie("200", 10, 2, 0.0f);
		System.out.println(c1.getDetails());
				
	}

}
