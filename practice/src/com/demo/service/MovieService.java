package com.demo.service;

import com.demo.model.*;
import com.demo.dao.MovieDao;

public class MovieService {
	
	private MovieDao dao = new MovieDao();
	
	public void addMovie(Movie movie) {
		dao.saveMovie(movie);
		System.out.println("Successfully movie added.");
	}
	
	public void removeMovie(int movieId) {
		Movie movie = dao.getMovieById(movieId);
		
		if(movie != null) {
			dao.deleteMovie(movieId);
			System.out.println("Successfully deleted");	
		} else {
			System.out.println("can not find the movie id");
			
		}
	}
	
	public void updateRating(int movieId, double rating) {
		
		Movie movie = dao.getMovieById(movieId);
		
		if(movie != null) {
			movie.setRating(rating);
			System.out.println("Successfully updated");
		} else {
			System.out.println("can not find the movie id");
		}
		
	}
	
	public void markUnavailable(int movieId) {
		Movie movie = dao.getMovieById(movieId);
		
		if(movie != null) {
			movie.setStatus("Unavaliable");
			System.out.println("movie is now unavailable");
		} else {
			System.out.println("can not find movie id");
		}
	}
	
	public void recommendMovie(double minRating, String type) {
		boolean found = false;
		
		for(Movie movie : dao.getAllMovie()) {
			if(movie.getRating() >= minRating) {
				if(type.equalsIgnoreCase("Bollywood") && movie instanceof Bollywood) {
					System.out.println("recommended : " + movie.toString());
					found = true;
				} else if(type.equalsIgnoreCase("Hollywood") && movie instanceof Hollywood) {
					System.out.println("recommended : " + movie.toString());
				}
			}
			
		}
		if(!found) {
			System.out.println("not found movie");
		}
	}
	
	public void displayAllMovie() {
		if(dao.getAllMovie().isEmpty()) {
			System.out.println("Database is empty");
			return;
		}
		
		for(Movie movie : dao.getAllMovie()) {
			System.out.println(movie.toString());
		}
	}
	
	public void displayByType(String type) {
		boolean found = false;
		
		for(Movie movie : dao.getAllMovie()) {
			if(type.equalsIgnoreCase("Bollywood") && movie instanceof Bollywood) {
				System.out.println(movie.toString());
				found = true;
			} else if(type.equalsIgnoreCase("Hollywood") && movie instanceof Hollywood) {
				System.out.println(movie.toString());
				found = true;
			}
		}
		if(!found) {
			System.out.println("movie not found");
		}
	}
	
	

}
