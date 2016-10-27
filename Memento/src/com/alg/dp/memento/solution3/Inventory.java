package com.alg.dp.memento.solution3;

import java.util.HashMap;

public class Inventory {
	private HashMap<Integer, Movie> movies;	
	
	public Inventory() {
		movies = new HashMap<Integer, Movie>();		
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
	
	public Memento getMemento() {
		Memento m = new Memento();
		m.setState(movies);
		return m;
	}
	
	public void setmemento(Memento m) {
		movies = m.getState();
	}
}
