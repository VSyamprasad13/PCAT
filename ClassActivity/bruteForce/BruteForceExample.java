package com.bruteForce;
// Task 7.a
public class BruteForceExample {

	public static void main(String[] args) {
		int[] arr= {5,-2,8,1,-9,50,15,3};
		BruteForceSort(arr);
		for(int n:arr) System.out.println(n);
	}
	public static void BruteForceSort(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}

}
