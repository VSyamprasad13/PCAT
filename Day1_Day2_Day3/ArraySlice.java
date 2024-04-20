package com.Day1_Day2_Day3;

import java.util.Scanner;

public class ArraySlice {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr= {11,8,68,1,6,3};
		System.out.println("Enter the start and end index to slice the array");
		int start=sc.nextInt();
		int end=sc.nextInt();
		int[] a=new int[end-start];
		slice(arr, start, end, a);
		for(int n:a) System.out.println(n);
		sc.close();
	}
	public static void slice(int[] arr,int start, int end,int[] a ) {
		for(int i=start,j=0;i<end;i++)
			a[j++]=arr[i];
	}

}
