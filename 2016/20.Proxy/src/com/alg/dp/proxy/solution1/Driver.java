package com.alg.dp.proxy.solution1;

public class Driver {

	public static void main(String[] args) {
		Document document = new Document();
		document.addText("Design document");
		document.addImage(new Image("D:\\image1.jpg"));
		document.addImage(new Image("D:\\image2.jpg"));
		document.addImage(new Image("D:\\image3.jpg"));
		
		document.open();
	}

}
