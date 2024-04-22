package com;

public class Numbers {

	public static void main(String[] args) {
		System.out.println("Even numbers from 1 to 10");
		for(int i=1;i<=10;i++) {
			if(i%2==0) System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Odd numbers from 1 to 10");
		int j=1;
		while(j<=10) {
			if(j%2!=0) System.out.print(j+" ");
			j++;
		}
	}

}
