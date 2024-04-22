package com.stringExercise;

public class StringBuitinMethods {

	public static void main(String[] args) {
		String str="Syam Prasad";
		System.out.println(str.length());
		System.out.println(str.charAt(2));
		System.out.println(str.substring(5));
		System.out.println(str.indexOf('s'));
		System.out.println(str.contains("Prasad"));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.replace("Syam", "Shyam"));
		String str1="     Hello World...   ";
		System.out.println(str1.trim());
		System.out.println("*************");
		String s="Hello this is syam";
		String[] split = s.split(" ");
		for(String s1:split) 
			System.out.println(s1);
		System.out.println("*************");
	}

}
