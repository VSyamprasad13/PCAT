package com;

public class SwapWithoutThird {

	public static void main(String[] args) {
		int n1=2;
		int n2=3;
		System.out.println("Before swapping n1="+n1+" n2="+n2);
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		System.out.println("After swapping n1="+n1+" n2="+n2);
	}

}
