package com.alg.oodesign.solution1;

public class Test {

	public static void main(String[] args) {
		SquareCookie s1 = new SquareCookie("100", 10);
		System.out.println(s1.getDetails());
		
		CircleCookie c1 = new CircleCookie("200", 10);
		System.out.println(c1.getDetails());
		
		NutsCircleCookie ns1 = new NutsCircleCookie("111", 10, 2);
		System.out.println(ns1.getDetails());

		SprinklesCircleCookie sc1 = new SprinklesCircleCookie("110", 10, 0.02f);
		System.out.println(sc1.getDetails());
		
	}

}
