package com.alg.dp.fw.solution3;

import java.util.HashMap;

public class FlyWeightFactory {
	private static HashMap<Integer, Digit> digits = new HashMap<Integer, Digit>();
	
	public static Digit getFlyWeight(int key) {
		if(! digits.containsKey(key))
			digits.put(key, new Digit(key));
		return digits.get(key);
	}

}
