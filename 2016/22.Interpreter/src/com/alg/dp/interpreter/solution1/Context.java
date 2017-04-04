package com.alg.dp.interpreter.solution1;

import java.util.HashMap;
import java.util.Map;

public class Context {
	private Map<String, Integer> map = new HashMap<String, Integer>();
	
	public void assign(String name, Integer value) {
		map.put(name, value);
	}
	
	public int lookup(String key) {
		return map.get(key);
	}
}
