package com.alg.dp.fm.solution3;

public interface ICache {
	void put(String key, Integer value);
	Integer get(String key);
}
