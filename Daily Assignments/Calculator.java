package com;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose the operation\n"
				+ args[0]+"\n"
				+args[1]+"\n"
				+ args[2]+"\n"
				+ args[3]);
		int choice=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		
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
