package com.array;

import java.util.Scanner;

public class ArrayEmaple1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		System.out.println("Enter the array elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		int max=0;
		for(int j=0;j<arr.length;j++) {
			if(arr[j]>max) max=arr[j];
		}
		
		int min=max;
		for(int j=0;j<arr.length;j++) {
			if(min>arr[j]) min=arr[j];
		}
		
		System.out.println("maximum: "+max+" minimum: "+min);
		
		sc.close();
	}

}
