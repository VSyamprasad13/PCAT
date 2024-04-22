package com.collectionsExamples;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetExample2 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(4,1,6,1,2,7,3,8,9,5,2,1);
		System.out.println(list);
		
		Set<Integer> set = new TreeSet<Integer>(list);
		System.out.println(set);
		
		Set<String> set2 = new TreeSet<String>();
		set2.add("David");
		set2.add("Miroma");
		set2.add("Jon");
		
		if(set2.add("Alok")) 
			System.out.println("Alok added to the set");
		if(!set2.add("David")) 
			System.out.println("David added to the list");
		else 
			System.out.println("David is already in the list..Duplicates are not allowed....");
		//
		Iterator<String> it = set2.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	
	}

}
