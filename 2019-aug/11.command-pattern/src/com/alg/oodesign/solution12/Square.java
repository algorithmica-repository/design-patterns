package com.alg.oodesign.solution12;

public class Square {
	private int id;
	private int length;
	private int centre_x;
	private int centre_y;

	public Square(int id, int length) {
		super();
		this.id = id;
		this.length = length;
	}
	
	public void move(int i, int j) {
		centre_x += i;
		centre_y += j;
	}
	
	public void unmove(int i, int j) {
		centre_x -= i;
		centre_y -= j;
	}
	
	public void scale(int k) {
		length *= k;
	}
	
	public void unscale(int k) {
		length /= k;
	}

	@Override
	public String toString() {
		return "Square [id=" + id + ", length=" + length + ", centre_x="
				+ centre_x + ", centre_y=" + centre_y + "]";
	}


}
