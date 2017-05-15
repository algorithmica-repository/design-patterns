package com.alg.dp.project16.solution1;

public class Driver {

	public static void main(String[] args) throws Exception {
		Document document = new Document();
		document.addText("understanding the cost with disk reads");
		document.addImage("C:\\Users\\Public\\Pictures\\Sample Pictures\\image1.jpg", "image1");
		document.addImage("C:\\Users\\Public\\Pictures\\Sample Pictures\\image2.jpg", "image2");
		document.open();
	}

}
