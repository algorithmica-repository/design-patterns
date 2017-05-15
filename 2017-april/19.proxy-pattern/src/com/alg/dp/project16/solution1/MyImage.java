package com.alg.dp.project16.solution1;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;


public class MyImage {
	private String path;
	private String name;
	
	public MyImage(String path, String name) {
		super();
		this.path = path;
		this.name = name;
	}

	public ImageIcon getImage() throws Exception {
		BufferedImage image = ImageIO.read(new File(path));
		ImageIcon imageIcon = new ImageIcon(image);
		return imageIcon;
	}
	
}
