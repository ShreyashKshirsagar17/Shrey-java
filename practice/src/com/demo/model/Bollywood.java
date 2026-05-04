package com.demo.model;

public class Bollywood extends Movie {
	
	

	private String language;
	private String leadActor;
	
	public Bollywood(int movieId, String movieName, double duration, double rating, String status,String language,String leadActor) {
		super(movieId, movieName, duration, rating, status);
		// TODO Auto-generated constructor stub
		this.language = language;
    	this.leadActor = leadActor;
		
	}
	

	
	public String toString() {
		return "[Bollywood]" + super.toString() + " | Language : "+ language+" | LeadActor : "+ leadActor;
	}
		
	
	

}
