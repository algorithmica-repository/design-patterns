package com.alg.dp.fm.solution3;

public class Client {
	private ICacheFactory cacheFactory;

	public Client(ICacheFactory cacheFactory) {
		this.cacheFactory = cacheFactory;
	}
	

	public ICacheFactory getCacheFactory() {
		return cacheFactory;
	}

	public static void main(String[] args) {
		int maxobj = Integer.parseInt(args[0]);
		
		ICacheFactory cacheFactory = new CacheFactory1();
		Client client = new Client(cacheFactory);
		ICache cache = client.getCacheFactory().createCache(maxobj);
	
		
		cache.put("e1",200);
		cache.put("e2",500);
		System.out.println(cache.get("e1"));
	}

}
