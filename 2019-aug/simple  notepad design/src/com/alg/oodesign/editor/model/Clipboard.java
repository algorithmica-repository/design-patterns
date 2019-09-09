package com.alg.oodesign.editor.model;

public class Clipboard {
	private String text;
	private static Clipboard clipboard = null;
	
	private Clipboard() { }
	
	public static Clipboard getInstance() {
		if(clipboard == null)
			clipboard = new Clipboard();
		return clipboard;
	}
	
	public void set(String text) {
		this.text = text;
	}
	
	public String get() {
		return text;
	}
	
	public void reset() {
		text = null;
	}
	
}
