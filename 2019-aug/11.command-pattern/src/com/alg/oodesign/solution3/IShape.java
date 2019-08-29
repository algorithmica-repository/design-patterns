package com.alg.oodesign.solution3;

public interface IShape {
	void move(int i, int j);
	void unmove(int i, int j);
	void scale(int k);
	void unscale(int k);
	void rotate();
	void unrotate();
}
