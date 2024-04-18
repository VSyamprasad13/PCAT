package com.array;

import java.util.Scanner;

public class ArrayExample1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] a= {34,67,5,24,10};
		int[] arr = new int[a.length-1];
		System.out.println("Enter the number to delete");
		int num=sc.nextInt();
		for(int i=0,j=0;i<a.length;i++) {
			if(num==a[i])
				continue;
			else arr[j++]=(int) (a[i]+a[i]*0.2);
		}
		a=arr;
		for(int n:a) System.out.println(n);
		sc.close();
	}

}
