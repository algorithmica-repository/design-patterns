package com.alg.dp.proxy.solution2;

import java.util.ArrayList;
import java.util.List;

public class Document {
	private String text;
	private List<ImageProxy> images;
	
	public Document() {
		images = new ArrayList<ImageProxy>();
	}
	public void addText(String text) {
		this.text = text;
	}
	public void addImage(ImageProxy image) {
		images.add(image);
	}
	
	public void open() {
		System.out.println(text);
		for(ImageProxy image:images) {
			image.display();
		}
	}
	
	public void displayImage(int ind) {
		images.get(ind).show();
	}
}
