package com.alg.dp.fm.solution3;

public class CacheFactory1 implements ICacheFactory {
	
	public ICache createCache(int maxobj) {
		ICache cache;
		if(maxobj < 200)
			cache = new DefaultCache();
		else if(maxobj < 1000)
			cache = new JCache();
		else 
			cache = new TrieCache();
		return cache;
	}

}
