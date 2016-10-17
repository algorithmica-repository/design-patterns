package com.alg.dp.fm.solution3;

public class TrieCache implements ICache {

	@Override
	public void put(String key, Integer value) {
		System.out.println("Key - value are added to trie cache");


	}

	@Override
	public Integer get(String key) {
		System.out.println("The value is retrieved using  trie cache");
		return null;
	}

}
