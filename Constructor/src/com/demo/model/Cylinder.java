package com.demo.model;

public class Cylinder {

	private int radius;
	private int height;
	
	public Cylinder() {
		radius = 1;
		height = 1;
	}
	
	public Cylinder(int r) {
		setRadius(r);
	}
	
	public Cylinder(int r, int h) {
		setRadius(r);
		setHeight(h);
	}
	
	public int getradius() {
		return radius;
	}
	
	public void setRadius(int r) {
		radius = r;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int h) {
		height = h;
	}
	
	public void setDimension(int r, int h) {
		radius = r; 
		height = h;
		
	}
	
	
	
}
