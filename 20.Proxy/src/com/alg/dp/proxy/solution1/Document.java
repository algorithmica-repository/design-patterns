package com.alg.dp.proxy.solution1;

import java.util.ArrayList;
import java.util.List;

public class Document {
	private String text;
	private List<Image> images;
	
	public Document() {
		images = new ArrayList<Image>();
	}
	public void addText(String text) {
		this.text = text;
	}
	public void addImage(Image image) {
		images.add(image);
	}
	
	public void open() {
		System.out.println(text);
		for(Image image:images) {
			image.display();
		}
	}
}
