package com.alg.dp.prototype.solution1;

public interface ICache {
	void put(String key, Integer value);
	Integer get(String key);
	ICache cloneCache();
}
