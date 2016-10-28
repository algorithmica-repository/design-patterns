package com.alg.dp.fm.solution1;

public class Client {

	public static void main(String[] args) {
		int maxobj = Integer.parseInt(args[0]);
		ICache cache;
		if(maxobj < 200)
			cache = new DefaultCache();
		else if(maxobj < 1000)
			cache = new JCache();
		else 
			cache = new TrieCache();
		
		cache.put("e1",200);
		cache.put("e2",500);
		System.out.println(cache.get("e1"));
	}

}
