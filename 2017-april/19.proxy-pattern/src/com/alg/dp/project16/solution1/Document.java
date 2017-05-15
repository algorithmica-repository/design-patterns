package com.alg.dp.project16.solution1;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Document {
	private StringBuffer text_;
	private List<MyImage> images_;
	
	public Document() {
		text_ = new StringBuffer();
		images_ = new ArrayList<MyImage>();
	}
	
	public void addText(String text) {
		text_.append(text);
	}
	
	public void addImage(String path, String name) {
		images_.add(new MyImage(path, name));
	}
	
	public void open() throws Exception {
		System.out.println(text_);
		for(MyImage tmp: images_) {
			JFrame frame = new JFrame();
	        JLabel jLabel = new JLabel();
	        jLabel.setIcon(tmp.getImage());
	        frame.getContentPane().add(jLabel, BorderLayout.CENTER);
	        frame.pack();
	        frame.setLocationRelativeTo(null);
	        frame.setVisible(true);
		}
	}
}
