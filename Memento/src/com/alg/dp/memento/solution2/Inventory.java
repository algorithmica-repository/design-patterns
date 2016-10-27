package com.alg.dp.memento.solution2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class Inventory {
	private HashMap<Integer, Movie> movies;
	private ObjectOutputStream oos;
	private ObjectInputStream ois;
	
	public Inventory(String file) throws Exception {
		movies = new HashMap<Integer, Movie>();
		oos = new ObjectOutputStream(new FileOutputStream(file));
		ois = new ObjectInputStream(new FileInputStream(file));
	}
	
	public void addMovie(Movie movie) {
		movies.put(movie.getId(), movie);
	}
	
	public void sellMovie(int id) {
		Movie tmp  = movies.get(id);
		if(tmp == null) {
			System.out.println("Movie does not exist");
			return;
		}
		if(tmp.getCopies() == 0) {
			System.out.println("Not available");
			return;
		}			
		tmp.setCopies(tmp.getCopies()-1);
	}
	
	public void addCopy(int id, int ncopies) {
		Movie tmp  = movies.get(id);
		if(tmp == null) {
			System.out.println("Movie does not exist");
			return;
		}
		tmp.setCopies(tmp.getCopies()+ncopies);
	}
	
	public void changePrice(int id, float price) {
		Movie tmp  = movies.get(id);
		if(tmp == null) {
			System.out.println("Movie does not exist");
			return;
		}
		tmp.setPrice(price);
	}
	
	public int findCopies(int id) {
		Movie tmp  = movies.get(id);
		if(tmp == null) {
			System.out.println("Movie does not exist");
			return -1;
		}
		return tmp.getCopies();
	}

	@Override
	public String toString() {
		return "Inventory [movies=" + movies + "]";
	}
	
	public void commit() throws Exception {
		oos.writeObject(movies);
	}
	
	public void rollback() throws Exception {
		movies = (HashMap<Integer, Movie>)(ois.readObject());
	}

}
