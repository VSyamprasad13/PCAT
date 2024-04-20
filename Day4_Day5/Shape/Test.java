package com.Day4_Day5;

//Day 4 and 5-->Task 2
public class Test {

	public static void main(String[] args) {
		Shape circle = new Circle(5);
		System.out.println("The area of circle is: "+circle.area());
		Shape rectangle = new Rectangle(10,5.5 );
		System.out.println("The area of rectangle is: "+rectangle.area());
	}

}
