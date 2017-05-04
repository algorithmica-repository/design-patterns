package com.alg.dp.project10.solution1;

import java.util.HashMap;

public class TrieCache implements ICache {
	private int size;
	private String policy;
	private String type;
	private HashMap<String, Integer> cache;
		
	public TrieCache(int size, String policy, String type) {
		super();
		this.size = size;
		this.policy = policy;
		this.type = type;
		cache = new HashMap<String, Integer>();
	}

	@Override
	public void put(String key, Integer value) {
		System.out.println("inserting key-value inside trie cache");

	}

	@Override
	public Integer get(String key) {
		System.out.println("Returning value from trie cache");
		return null;
	}

}
