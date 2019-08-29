package com.alg.oodesign.solution4;

public class Rectangle implements IShape {
	private int id;
	private int length;
	private int breadth;
	private int centre_x;
	private int centre_y;
	
	public Rectangle(int id, int length, int breadth) {
		super();
		this.id = id;
		this.length = length;
		this.breadth = breadth;
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

	@Override
	public void scale(int k) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unscale(int k) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Rectangle [id=" + id + ", length=" + length + ", breadth="
				+ breadth + ", centre_x=" + centre_x + ", centre_y=" + centre_y
				+ "]";
	}


}
