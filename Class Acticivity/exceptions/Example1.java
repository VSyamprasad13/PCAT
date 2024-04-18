package com.exceptions;

public class Example1 {

	public static void main(String[] args) {
		try {
//			int[] arr= {1,2,5,7};
//			System.out.println(arr[6]);
//			String str=null;
//			System.out.println(str.length());
			System.out.println(10/0);
//		}catch (ArithmeticException e) {	
//			System.out.println(e.getMessage());
//		}catch (NullPointerException e) {
//			System.out.println(e.getMessage());
//		}catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println(e.getMessage());
		}catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e ) {
			System.out.println("Something went wrong");
		}	
	}

}
