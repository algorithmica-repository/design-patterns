package com.alg.dp.prototype.solution1;

public class Client {


	public static void main(String[] args) {
		int maxobj = Integer.parseInt(args[0]);
		ICache cache = CacheFactory.createCache(maxobj);		
		
		cache.put("e1",200);
		cache.put("e2",500);
		System.out.println(cache.get("e1"));
	}

}
