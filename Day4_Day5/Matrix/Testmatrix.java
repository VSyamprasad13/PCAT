package com.Day4_Day5;

import java.util.Scanner;

public class Testmatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt();
//		int b=sc.nextInt();
		Matrix mat=new Matrix(3,3);
		int arr[][]={ {1,2,3},{4,5,6},{7,8,9}};
		
		mat.setValues(arr);
		mat.printMatrix();
		sc.close();
	}

}
