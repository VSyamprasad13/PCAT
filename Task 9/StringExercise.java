package com.stringExercise;
//Task 9
public class StringExercise {

	public static void main(String[] args) {
		String s1="";
		String s2="";
		int length=5;
		stringOperation(s1, s2, length);
	}
	public static void stringOperation(String s1,String s2,int length) {
		if(s1.isEmpty() || s2.isEmpty()) {
			System.out.println("Empty strings");
			return;
		}
		String s3=s1+s2;
		System.out.println("Concaticated String: "+s3);
		String rev="";
		for(int i=s3.length()-1;i>=0;i--) {
			rev+=s3.charAt(i);
		}
		System.out.println("Reversed String: "+rev);
		String s4="";
		if(length<0 || length>s3.length())
			System.out.println("Invalid length");
		else {
			for(int i=0;i<length;i++)
				s4+=s3.charAt(i);
//			s4=s3.substring(length);
		}
		System.out.println(s4);
	} 

}
