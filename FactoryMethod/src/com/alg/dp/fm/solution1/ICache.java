package com.alg.dp.fm.solution1;

public interface ICache {
	void put(String key, Integer value);
	Integer get(String key);
}
