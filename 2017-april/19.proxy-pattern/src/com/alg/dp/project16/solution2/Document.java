package com.alg.dp.project16.solution2;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Document {
	private StringBuffer text_;
	private List<IProxy> images_;
	
	public Document() {
		text_ = new StringBuffer();
		images_ = new ArrayList<IProxy>();
	}
	
	public void addText(String text) {
		text_.append(text);
	}
	
	public void addImage(String path, String name) {
		images_.add(new MyImageProxy(path, name));
	}
	
	public void open() throws Exception {
		System.out.println(text_);
		for(IProxy tmp: images_) {
			System.out.println(tmp.getAlter());
		}
	}
	
	public void clickImage() throws Exception {
		JFrame frame = new JFrame();
        JLabel jLabel = new JLabel();
        jLabel.setIcon(images_.get(0).getImage());
        frame.getContentPane().add(jLabel, BorderLayout.CENTER);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
	}
}
