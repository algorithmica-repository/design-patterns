package com.alg.dp.memento.solution3;

import java.io.Serializable;
import java.util.HashMap;

public class Memento implements Serializable {
	private HashMap<Integer, Movie> movies;
	
	public void setState(HashMap<Integer, Movie> movies) {		
		this.movies = movies;
	}
	
	public HashMap<Integer, Movie>  getState() {
		return movies;
	}

	@Override
	public String toString() {
		return "Memento [movies=" + movies + "]";
	}
	
	
}
