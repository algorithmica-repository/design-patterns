package com.alg.dp.command.solution3;

public class Square {
	private int side;
	private int id;
	private int x;
	private int y;
	
	public Square(int id, int side) {
		super();
		this.side = side;
		this.id = id;
		this.x = 0;
		this.y = 0;
	}	

	public void scale(int factor) {
		side *= factor;
	}
	
	public void move(int i, int j) {
		x += i;
		y += j;
	}

	@Override
	public String toString() {
		return "Square [side=" + side + ", id=" + id + ", x=" + x + ", y=" + y
				+ "]";
	}
	public void undoscale(int factor) {
		side /= factor;
	}
	
	public void undomove(int i, int j) {
		x -= i;
		y -= j;
	}
	
	
}
