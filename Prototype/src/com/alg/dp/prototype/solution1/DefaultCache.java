package com.alg.dp.prototype.solution1;

public class DefaultCache implements ICache {

	@Override
	public ICache cloneCache() {		
		ICache cache = new DefaultCache();
		//cache.setState(this.getState());
		return cache;
	}

	@Override
	public void put(String key, Integer value) {
		System.out.println("Key - value are added to default cache");

	}

	@Override
	public Integer get(String key) {
		System.out.println("The value is retrieved using default cache");
		return null;
	}

}
