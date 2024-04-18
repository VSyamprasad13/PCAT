package com.array;

public class ArrayEx {
	public static void main(String[] args) {
		int[] arr= {1,8,3,5,20,9,23,65,10};
		int avg=average(arr);
		System.out.println(avg);
	}
	public static int average(int[] a) {
		int sum=0;
		for(int i:a)
			sum+=i;
		return sum/a.length;
	}
}
