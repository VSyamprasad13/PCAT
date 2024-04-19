package com.array;


public class ArrayRev {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		int[] temp=new int[arr.length];
		
		for(int i=arr.length-1,j=0;i>=0;i--) {
			temp[j++]=arr[i];
		}
		for(int n:arr) System.out.print(n+" ");
		System.out.println();
		for(int num:temp) System.out.print(num+" ");
	}

}
