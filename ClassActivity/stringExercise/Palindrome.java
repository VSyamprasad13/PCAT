package com.stringExercise;

public class Palindrome {

	public static void main(String[] args) {
		String s="naman";
		int i=0,j=s.length()-1;
		boolean flag=true;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				flag=false;
				break;
			}
			i++;
			j--;
		}
		if(flag) System.out.println("Palindrome");
		else System.out.println("Not a palindrome");
	}

}
