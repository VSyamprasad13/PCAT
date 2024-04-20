package com.Day4_Day5;

public class Rectangle extends Shape {
	private double length;
	private double width;
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	
	public double area() {
		return length*width;
	}
}
