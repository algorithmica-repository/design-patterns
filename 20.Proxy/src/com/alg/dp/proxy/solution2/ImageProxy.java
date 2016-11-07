package com.alg.dp.proxy.solution2;

public class ImageProxy implements IImage {
	private Image image;
	private String filename;
	public ImageProxy(String filename) {
		this.filename = filename;
		image = new Image(filename);
	}
	@Override
	public void display() {
		System.out.println(filename);		
	}
	@Override
	public void show() {
		image.show();
	}

	
}
