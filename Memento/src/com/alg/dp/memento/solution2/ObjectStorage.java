package com.alg.dp.memento.solution2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectStorage {

	static class Temp implements Serializable {
		int id;
		String name;		
		
		public Temp(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		@Override
		public String toString() {
			return "Temp [id=" + id + ", name=" + name + "]";
		}	
		
	}
	
	public static void main(String[] args) throws Exception {
		String file = args[0];
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
		oos.writeObject(new Temp(1, "abc"));
		oos.writeObject(new Temp(2, "def"));
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
		System.out.println(ois.readObject());
		System.out.println(ois.readObject());
	}

}
