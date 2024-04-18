package com.array;

import java.util.Scanner;

public class Array2DExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] arr = new int[4][5];
		
		System.out.println("Enter the array elements");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
//		Traversing the array
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				System.out.print(arr[i][j]+"	");
//			}
//			System.out.println();
//		}
		
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				sum+=arr[i][j];
			}
		}
		System.out.println("The sum of the array :"+sum);
		sc.close();
	}

}
