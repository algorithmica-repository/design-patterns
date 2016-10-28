package com.alg.dp.prototype.solution1;

import java.util.HashMap;

public class CacheFactory {
	private static HashMap<String, ICache> cacheProtos =
		new HashMap<String, ICache>();
	
	static {
		//perform time consuming initialization work of default cache object
		ICache cache = new DefaultCache();
		//cache.setState(read from disk/network);
		cacheProtos.put("default", cache);
		
		//perform time consuming initialization work of default cache object
		cache = new JCache();
		//cache.setState(read from disk/network);
		cacheProtos.put("jcache",cache);
		
		//perform time consuming initialization work of default cache object
		cache = new TrieCache();
		//cache.setState(read from disk/network);
		cacheProtos.put("trie", cache);
	}
	
	public static ICache createCache(int maxobj) {
		ICache cache;
		if(maxobj < 200)
			cache = cacheProtos.get("default").cloneCache();
		else if(maxobj < 1000)
			cache = cacheProtos.get("jcache").cloneCache();
		else 
			cache = cacheProtos.get("trie").cloneCache();
		return cache;
	}

}
