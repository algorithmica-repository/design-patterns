package com.alg.oodesign.solution1;

import java.util.ArrayList;
import java.util.List;

public class Document {
	private String text;
	private List<MyImage> images;	

	public Document() {
		images = new ArrayList<MyImage>();
	}
	
	public void addText(String text) {
		this.text = text;
	}

	public void addImage(MyImage image) {
		images.add(image);
	}
	
	public void open() throws Exception {
		System.out.println(text);
		for(MyImage image:images) {
			image.display();
		}
	}
}
