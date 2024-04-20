package com.Day4_Day5;
//Day 4 and 5-->Task 1

public class Matrix {
	private int rows;
	private int col;
	private int[][] arr;
	public Matrix(int rows, int col) {
		super();
		this.rows = rows;
		this.col = col;
		this.arr=new int[rows][col];
	}
	public void setValues(int[][] a) {
		for(int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=a[i][j];
			}
		}
	}
	public void printMatrix() {
		for(int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
