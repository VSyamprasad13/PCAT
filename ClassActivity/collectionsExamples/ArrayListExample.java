package com.collectionsExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list1=new ArrayList<Integer>(list);
		list.add(30);
		list.add(1);
		list.add(0);
		list.add(10);
		list.add(19);
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("David");
		list2.add("Mario");
		list2.add("Luffy");
		list2.add("Zoro");
		//Approach 1
		System.out.println("Traversing list using for loop");
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
		//Approach 2
		System.out.println("Traversing list using for each loop");
		for(String s:list2)
			System.out.println(s);
		
		//Approach 3
		System.out.println("Traversing list using iterator");
		Iterator<String> it=list2.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//Approach 4 : Traverse list from reverse order
		System.out.println("Traversing list using list iterator in both forward and backward direction");
		System.out.println("*****Forward direction*****");
		ListIterator<String> li=list2.listIterator();
		while(li.hasNext())
			System.out.println(li.next());
		System.out.println("*****Reverse direction*****");
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		/*ArrayList list3=new ArrayList();
		list3.add("syam");
		list3.add("David");
		list3.add(4);
		
		for(int i=0;i<list3.size();i++) {
			System.out.println(list3.get(i));
		}*/
		
		System.out.println("---in built methods of array list---");
		System.out.println(list.size());
		System.out.println(list.isEmpty());//It returns True or False values 
//		System.out.println(list.indexOf("Luffy"));//It returns -1 because it doesn't have luffy
		System.out.println(list.indexOf(4));//1
		System.out.println(list2.add("Naruto"));//it returns true if element is added into the list
		System.out.println(list2.remove(0));//It returns the index value from the list
		System.out.println(list2.get(3));
		System.out.println(list2.lastIndexOf("Naruto"));
		list2.add(0, "Yuji");
		System.out.println("Traversing list using for each loop");
		for(String s:list2)
			System.out.println(s);
		
		list1.addAll(list);// Add all elements from list to list1
//		list1.addAll(0, list1);
		System.out.println("Traversing list using for each loop");
		for(int s:list1)
			System.out.println("Wait "+s);
		
		//Sorting using inbuilt method sort from Collections class
		System.out.println("*****After sorting*****");
		Collections.sort(list);
		for(int n:list)
			System.out.println(n);
		
	}

}
