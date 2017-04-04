package com.alg.dp.fw.solution3;

import java.util.Random;

public class Driver {

	public static void main(String[] args) {
		Digit[] digits = new Digit[100];
		Random r = new Random(100);
		
		for(int i = 0; i < 100; ++i) {
			digits[i] = FlyWeightFactory.getFlyWeight(r.nextInt(10));
			System.out.println(digits[i].toString(i));
		}
			

	}

}
