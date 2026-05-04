package com.demo.dao;

import com.demo.model.Movie;
import java.util.*;

public class MovieDao {
	
	private TreeMap<Integer, Movie> movieDatabase = new TreeMap<>();

	public void saveMovie(Movie movie) {
		// TODO Auto-generated method stub
		movieDatabase.put(movie.getMovieId(), movie);
		
	}

	public Movie getMovieById(int movieId) {
		return movieDatabase.get(movieId);
		
		
	}

	public void deleteMovie(int movieId) {
		movieDatabase.remove(movieId);
		
	}
	
	public Collection<Movie> getAllMovie(){
		return movieDatabase.values();
	}
	
	
	
	
	
	

}
