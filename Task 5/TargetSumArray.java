package com.array;

import java.util.Scanner;

public class TargetSumArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the target value");
		int num = sc.nextInt();
		int[] arr= {3,6,7,1,9,2,0,16};
		int count=0;
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=i;j<arr.length;j++) {
				sum=arr[i]+arr[j];
				if(sum==num) {
					System.out.println(arr[i]+"+"+arr[j]+"="+num);
					count++;
				}
			}
		}
		if(count==0) System.out.println("No match");
		sc.close();
	}

}
