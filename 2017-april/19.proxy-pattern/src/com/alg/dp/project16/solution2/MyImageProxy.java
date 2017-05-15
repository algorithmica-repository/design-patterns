package com.alg.dp.project16.solution2;

import javax.swing.ImageIcon;

public class MyImageProxy implements IProxy {
	private MyImage image_;
	
	public MyImageProxy(String path, String name) {
		image_ = new MyImage(path, name);
	}	
	
	public ImageIcon getImage() throws Exception {
		return image_.getImage();
	}

	@Override
	public String getAlter() {
		return image_.getAlter();
	}
}
