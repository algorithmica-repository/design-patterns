package com.alg.oodesign.solution2;

import java.util.ArrayList;
import java.util.List;

public class Document {
	private String text;
	private List<MyImageProxy> images;	

	public Document() {
		images = new ArrayList<MyImageProxy>();
	}
	
	public void addText(String text) {
		this.text = text;
	}

	public void addImage(MyImage image) {
		MyImageProxy proxy = new MyImageProxy(image);
		images.add(proxy);
	}
	
	public void open() throws Exception {
		System.out.println(text);
		for(MyImageProxy image:images) {
			image.display();
		}
		images.get(0).showImage();
		
	}
}
