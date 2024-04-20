package com.Day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		System.out.println(list);		
		System.out.println(list.size());
		removeSecond(list);
	}
	public static void removeSecond(List<Integer> list) {
		List<Integer> list1=new ArrayList<Integer>();
		for(int i=0;i<list.size();i++) {
			if(i%2!=0)
				continue;
			else list1.add(list.get(i));
		}
		System.out.println("After removing every second element from the list..");
		System.out.println(list1);
	}

}
