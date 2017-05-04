package com.alg.dp.project10.solution2;

import java.util.HashMap;
import java.util.List;

public class DefaultCache implements ICache {
	private int size;
	private String policy;
	private HashMap<String, Integer> cache;
	
	public DefaultCache(int n, String policy) {
		size = n;
		this.policy = policy;
		cache = new HashMap<String, Integer>();
	}

	@Override
	public void put(String key, Integer value) {
		System.out.println("inserting key-value inside default cache");

	}

	@Override
	public Integer get(String key) {
		System.out.println("Returning value from default cache");
		return null;
	}

}
