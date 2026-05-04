package com.demo.model;

public class Hollywood extends Movie {
	
	private String studioName;
	private double budget;

	public Hollywood(int movieId, String movieName, double duration, double rating, String status, String studioName, double budget) {
		super(movieId, movieName, duration, rating, status);
		// TODO Auto-generated constructor stub
		
		this.studioName = studioName;
		this.budget = budget;
	}
	
	public String toString() {
		return "[Hollywood]" + super.toString() +" | StudioName : "+studioName+" | Budget" + budget;
	}

}
