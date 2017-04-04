package com.alg.dp.proxy.solution2;

public class Driver {

	public static void main(String[] args) {
		Document document = new Document();
		document.addText("Design document");
		document.addImage(new ImageProxy("D:\\image1.jpg"));
		document.addImage(new ImageProxy("D:\\image2.jpg"));
		document.addImage(new ImageProxy("D:\\image3.jpg"));
		
		document.open();
		
		document.displayImage(0);
		document.displayImage(1);
	}

}
