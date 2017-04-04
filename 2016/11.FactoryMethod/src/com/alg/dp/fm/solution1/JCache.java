package com.alg.dp.fm.solution1;

public class JCache implements ICache {

	@Override
	public void put(String key, Integer value) {
		System.out.println("Key - value are added to jcache");


	}

	@Override
	public Integer get(String key) {
		System.out.println("The value is retrieved using jcache");
		return null;
	}

}
