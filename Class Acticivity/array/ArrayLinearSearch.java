package com.array;

import java.util.Scanner;

public class ArrayLinearSearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr= {11,8,68,1,6,3};
		System.out.println("Enter the number to be search");
		int num=sc.nextInt();
		int search = performLinearSearch(arr,num);
		if(search<0) System.out.println("Not found");
		else System.out.println("Number found at: "+search+" index");
		sc.close();
	}
	public static int performLinearSearch(int[] a,int num) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==num)
				return i;
		}
		return -1;
	}

}
