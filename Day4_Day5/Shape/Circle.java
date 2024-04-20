package com.Day4_Day5;

public class Circle extends Shape {
	private double radius;
//	static double pi=3.14;
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}



	@Override
	public double area() {
		return Math.PI*radius*radius;
	}
	
}
