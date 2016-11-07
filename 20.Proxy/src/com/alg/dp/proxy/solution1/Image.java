package com.alg.dp.proxy.solution1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Image {
	private String filename;

	public Image(String filename) {
		this.filename = filename;
		try  {
		ObjectOutputStream oos;
		oos = new ObjectOutputStream(new FileOutputStream(filename));
		oos.writeObject(filename);
		oos.close();
		} catch(Exception e) {
			System.out.println(e);
		}
	}

	public void display() {
		ObjectInputStream ois;
		try {
			ois = new ObjectInputStream(new FileInputStream(filename));
			String o = (String)ois.readObject();
			System.out.println(o);
			ois.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
