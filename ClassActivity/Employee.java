package com;

import java.util.Scanner;

public class Employee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the employee details...");
		int eNo=sc.nextInt();
		String eName=sc.next();
		int age = sc.nextInt();
		double salary=sc.nextDouble();
		
		System.out.println("The details of the employee"+
					"\nEmployee No: "+eNo+"\nName: "+eName
					+"\nAge: "+age+"\nSalary: "+(salary+(salary*25/100)));
		sc.close();
	}
}
