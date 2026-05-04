package com.demo.model;

public class Movie {
	
	private int movieId;
	private String movieName;
	private double duration;
	private double rating;
	private String status;
	
	public Movie(int movieId, String movieName, double duration, double rating, String status) {
		
		this.movieId = movieId;
		this.movieName = movieName;
		this.duration = duration;
		this.rating = rating;
		this.status  = status;
	}
	
	public int getMovieId() { return movieId; }
	public String getMovieName() { return movieName; }
	public double getRating() { return rating; }
	public String getStatus() { return status; }
	public double getDuration() { return duration; }
	
	
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String toString() {
		return "ID: "+ movieId +"| Name : "+ movieName +"| Time: "+duration+"| Rating : "+rating+"| Status"+status;
	}
	
	

}
