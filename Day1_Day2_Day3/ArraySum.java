package com.Day1_Day2_Day3;
//Task 6.a
public class ArraySum {

	public static void main(String[] args) {
		int[] arr= {2,8,1,9,50,15,3};
		System.out.println(sumArray(arr, 0, arr.length-1));
	}
	public static int sumArray(int[] arr,int i, int j) {
		if(i>j)
		return 0;
		else return sumArray(arr, i+1,j)+arr[i];
	}

}
