package com.alg.dp.fw.solution1;

public class Digit {
	private int value;
	private String color;
	private String font;
	private int fontsize;
	
	public Digit(int value, String color, String font, int fontsize) {
		super();
		this.value = value;
		this.color = color;
		this.font = font;
		this.fontsize = fontsize;
	}
	
	@Override
	public String toString() {
		return "Digit [value=" + value + ", color=" + color + ", font=" + font
				+ ", fontsize=" + fontsize + "]";
	}
	
	
}
