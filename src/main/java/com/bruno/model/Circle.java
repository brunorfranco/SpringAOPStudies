package com.bruno.model;

public class Circle {

	private String name;
	private double radius;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public Double calculateDiameter(double radius){
		return radius * 2;
	}
}
