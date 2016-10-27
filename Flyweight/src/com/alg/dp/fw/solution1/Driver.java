package com.alg.dp.fw.solution1;

import java.util.Random;

public class Driver {

	public static void main(String[] args) {
		Digit[] digits = new Digit[100];
		Random r = new Random(100);
		String[] colors = {"Red" , "Black" };
		String[] fonts = {"Arial", "Century" };
		
		for(int i = 0; i < 100; ++i) {
			digits[i] = new Digit(r.nextInt(10), colors[r.nextInt(2)], fonts[r.nextInt(2)], r.nextInt(10) + 5);
			System.out.println(digits[i]);
		}
			

	}

}
