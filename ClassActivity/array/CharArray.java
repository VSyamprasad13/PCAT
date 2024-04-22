package com.array;

public class CharArray {

	public static void main(String[] args) {
		char[] ch= {'w','i','p','r','o'};
		int count=0;
		for(char c:ch) {
			if(c=='a' || c=='e' || c=='i' || c=='o' || c== 'u') count++;
		}
		System.out.println("Vowel count: "+count);
	}

}
