package com.array;


public class ArrayRev {

	public static void main(String[] args) {
		int[] arr= {2,7,8,4,10,3,1};
		int[] temp=new int[arr.length];
		
		for(int i=arr.length-1,j=0;i>=0;i--) {
			temp[j++]=arr[i];
		}
		for(int n:arr) System.out.print(n+" ");
		System.out.println();
		for(int num:temp) System.out.print(num+" ");
	}

}
