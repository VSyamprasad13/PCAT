package com;

public class StringExample {

	public static void main(String[] args) {
		String[] str = {"Syam","Dave","David","James"};
		
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
//			System.out.println();
			for(int j=0;j<str[i].length();j++)
				System.out.println(str[i].charAt(j));
		}
		
	}

}
