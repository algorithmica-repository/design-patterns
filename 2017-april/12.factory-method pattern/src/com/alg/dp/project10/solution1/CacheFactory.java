package com.alg.dp.project10.solution1;

public class CacheFactory {
	
	public static ICache getCache(int n) {
		if(n < 200) return new DefaultCache(n,"lru");
		if(n  < 1000) return new JCache(n, "fifo", true);
		return new TrieCache(n, "lfu", "tst");
	}
	
}
