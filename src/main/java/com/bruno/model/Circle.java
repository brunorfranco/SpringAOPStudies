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
	
	public void testingReceivingTwoArguments(String first, Integer second){
		System.out.println("Inside the method: " + first + second);
	}
	
	public String testAroundAspect(){
		return "Testing the Around Aspect";
	}
}
