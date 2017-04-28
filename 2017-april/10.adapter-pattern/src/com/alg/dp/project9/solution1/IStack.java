package com.alg.dp.project9.solution1;

import java.util.Iterator;

public interface IStack {
	void push(Integer e);
	Integer pop();
	Iterator<Integer> iterator();
	int size();
}
