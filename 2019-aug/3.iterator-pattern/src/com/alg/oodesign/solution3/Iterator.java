package com.alg.oodesign.solution3;

public abstract class Iterator {
	int current;
	abstract boolean hasNext();
	abstract MenuItem next();
	abstract void reset();
}
