package com;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=Integer.valueOf(args[0]);
		int b=Integer.valueOf(args[1]);
		System.out.println("Choose the operation\n"
				+ "1.Addition\n"
				+ "2.Substraction\n"
				+ "3.Multiplication\n"
				+ "4.Division");
		int choice=sc.nextInt();
		
		switch(choice) {
		case 1:System.out.println("Addition is:"+(a+b));
		break;
		case 2:System.out.println("Substraction is:"+(a-b));
		break;
		case 3:System.out.println("Multiplication is:"+(a*b));
		break;
		case 4:System.out.println("Division is:"+(a/b));
		break;
		default:System.out.println("Invalid choice");
		}
		sc.close();
		
	}

}
