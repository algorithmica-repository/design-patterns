package com.alg.oodesign.solution2;

public class MyImageProxy implements IImageProxy {
	private MyImage target;
	
	public MyImageProxy(MyImage target) {
		super();
		this.target = target;
	}

	@Override
	public void display() throws Exception {
		System.out.println(target.getPath());		
	}

	public void showImage() throws Exception {
		target.display();
	}
}
