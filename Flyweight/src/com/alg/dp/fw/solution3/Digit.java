package com.alg.dp.fw.solution3;

public class Digit {
	private int value;
	private String color;
	
	public Digit(int value) {
		super();
		this.value = value;
		this.color = value%2 == 0? "Red":"Black";
	}
	
	public String toString(int ind) {
		return "Digit [value=" + value + ", color=" + color + ", font=" + (ind%2==0?"Century":"Arial")
				+ ", fontsize=" + (ind%2==0?10:15) + "]";
	}
	
	
}
