package com.alg.oodesign.solution2;

public class Rectangle {
	private int length;
	private int breadth;
	private int centre_x;
	private int centre_y;
	
	public Rectangle(int length, int breadth, int centre_x, int centre_y) {
		super();
		this.length = length;
		this.breadth = breadth;
		this.centre_x = centre_x;
		this.centre_y = centre_y;
	}

	private void swap() {
		int tmp = this.length;
		this.length = this.breadth;
		this.breadth = tmp;
	}
	public void rotate() {
		swap();
	}	
	public void unrotate() {
		swap();
	}
	public void move(int i, int j) {
		centre_x += i;
		centre_y += j;
	}
	public void unmove(int i, int j) {
		centre_x -= i;
		centre_y -= j;
	}
	
}
