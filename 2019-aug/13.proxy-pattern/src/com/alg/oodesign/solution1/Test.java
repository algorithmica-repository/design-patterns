package com.alg.oodesign.solution1;

public class Test {

	public static void main(String[] args) throws Exception {
		Document d1 = new Document();
		d1.addText("understanding proxy");
		d1.addImage(new MyImage("C:\\Users\\Public\\Pictures\\Sample Pictures\\image1.jpg"));
		d1.addImage(new MyImage("C:\\Users\\Public\\Pictures\\Sample Pictures\\image2.jpg"));
		d1.addImage(new MyImage("C:\\Users\\Public\\Pictures\\Sample Pictures\\image3.jpg"));
	
		d1.open();
	}

}
