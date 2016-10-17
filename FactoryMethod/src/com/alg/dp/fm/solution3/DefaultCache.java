package com.alg.dp.fm.solution3;

public class DefaultCache implements ICache {

	@Override
	public void put(String key, Integer value) {
		System.out.println("Key - value are added to default cache");

	}

	@Override
	public Integer get(String key) {
		System.out.println("The value is retrieved using default cache");
		return null;
	}

}
