package com.alg.dp.project10.solution1;

import java.util.HashMap;

public class JCache implements ICache {
	private int size;
	private String policy;
	private boolean isSerializable;
	private HashMap<String, Integer> cache;

	public JCache(int size, String policy, boolean isSerializable) {
		super();
		this.size = size;
		this.policy = policy;
		this.isSerializable = isSerializable;
		cache = new HashMap<String, Integer>();
	}

	@Override
	public void put(String key, Integer value) {
		System.out.println("inserting key-value inside jcache");

	}

	@Override
	public Integer get(String key) {
		System.out.println("Returning value from jcache");
		return null;
	}

}
