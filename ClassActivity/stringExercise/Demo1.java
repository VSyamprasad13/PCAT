package com.stringExercise;

public class Demo1 {

	public static void main(String[] args) {
		String s="Syam";
		s.concat("Prasad");
		System.out.println(s);
		System.out.println(s.concat(" Prasad"));
		
		String s1="David";
		String s2="David";
		String s3=new String("David");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s.equals(s3));
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		
		System.out.println(s1.compareToIgnoreCase(s));
		System.out.println(s.compareToIgnoreCase(s1));
		System.out.println(s1.compareTo(s2));
		
		// Not synchronized
		StringBuilder s4=new StringBuilder("Hello");
		s4.append(" Prasad");
		System.out.println(s4);
		
		//Synchronized
		StringBuffer s5= new StringBuffer("Hello");
		s5.append(" Prasad... How are you!");
		System.out.println(s5);
	}

}
