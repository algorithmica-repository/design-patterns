package com.alg.dp.project10.solution2;

public class CacheFactory1 implements ICacheFactory {
	
	public ICache getCache(int n) {
		if(n < 200) return new DefaultCache(n,"lru");
		if(n  < 1000) return new JCache(n, "fifo", true);
		return new TrieCache(n, "lfu", "tst");
	}
}
