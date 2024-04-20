package com.math.operations;
//Day 4 and 5-->Task 3
public class Driver {

	public static void main(String[] args) {
		Addition add=new Addition(10, 20);
		System.out.println("Addition: "+add.sum());
		Substraction sub = new Substraction(20, 10);
		System.out.println("Substraction: "+sub.substraction());
		Multiplcation multiplcation = new Multiplcation(5, 5);
		System.out.println("Multiplication: "+multiplcation.multiplication());
		Division division = new Division(10, 2);
		System.out.println("Division: "+division.division());
	}

}
