package com.alg.oodesign.solution2;

import java.awt.BorderLayout;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyImage implements IImageProxy {
	private String path;

	public MyImage(String path) {
		super();
		this.path = path;
	}
	
	public void display() throws Exception {
		BufferedImage image = ImageIO.read(new File(path));
		ImageIcon imageIcon = new ImageIcon(image);
		JFrame frame = new JFrame();
    	JLabel jLabel = new JLabel();
    	jLabel.setIcon(imageIcon);
    	frame.getContentPane().add(jLabel, BorderLayout.CENTER);
    	frame.pack();
    	frame.setLocationRelativeTo(null);
    	frame.setVisible(true);
	}
	
	public String getPath() {
		return path;
	}
}
