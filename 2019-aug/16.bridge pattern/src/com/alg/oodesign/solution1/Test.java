package com.alg.oodesign.solution1;

public class Test {

	public static void main(String[] args) {
		PersistentConnection p1 = new PersistentConnection("abc", "123");
		p1.setMaxLife(20);
		p1.connect("oracle");
		System.out.println(p1);		
		 
	}

}
