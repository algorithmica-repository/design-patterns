package com.alg.dp.proxy.solution2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Image implements IImage {
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
			System.out.println("Displaying actual image of " + o);
			ois.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Override
	public void show() {
		display();
	}
	
}
