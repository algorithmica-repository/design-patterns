package com.alg.dp.project10.solution2;

public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		ICacheFactory cacheFactory = new CacheFactory1();
		ICache cache = cacheFactory.getCache(n);
		cache.put("abc",100);
		cache.put("def", 2000);
		cache.put("xyz", 170);
		cache.get("abc");
	}

}
