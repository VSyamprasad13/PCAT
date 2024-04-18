package com;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number to be checked");
		int num=sc.nextInt();
		int count=0;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				count++;
				break;
			}
		}
		if(count==0) 
			System.out.println(num+" is a Prime number");
		else 
			System.out.println("Not a prime number");
		sc.close();
	}

}
