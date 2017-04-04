package com.alg.dp.singleton;

public class Clipboard {
	private static Clipboard clipboard; 
	private String data;
	
	private Clipboard() {
		
	}
	public static Clipboard getInstance() {
		if(clipboard == null)
			clipboard = new Clipboard();
		return clipboard;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	

}
