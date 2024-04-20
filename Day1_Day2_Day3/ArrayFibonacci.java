package com.Day1_Day2_Day3;

import java.util.Scanner;

public class ArrayFibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int[] arr=new int[n];
		
		int a=0,b=1;
		arr[0]=0;
		arr[1]=1;
		fibonacci(n-2, a, b,arr,2);
		for(int i:arr) 
			System.out.print(i+" ");
		System.out.println();
		System.out.println("nth element: "+arr[n-1]);
		sc.close();
	}
	public static int fibonacci(int n,int a,int b,int[] arr,int j) {
		if(n>0) {
			arr[j]=a+b;
			return fibonacci(n-1, b, a+b,arr,j+1);
		}
		return 0;
	}

}
