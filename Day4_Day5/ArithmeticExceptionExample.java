package com.Day4_Day5;
//Day 4 and 5-->Task 4.0
public class ArithmeticExceptionExample {

	public static void main(String[] args) {
		int num=10;
		try {
			System.out.println(num/0);
		}catch (ArithmeticException ae) {
			System.out.println("Divide by 0 is not possible "+ae.getMessage());
		}
	}

}
