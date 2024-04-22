package com.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class TestStudent {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(new Student(100, "David", 23));
		list.add(new Student(101, "Jon", 21));
		list.add(new Student(102, "Doe", 22));
		
		System.out.println("Sorting by name");
		Collections.sort(list, new NameComparator());
		for(Student s:list)
			System.out.println(s);
		
		System.out.println("Sorting by age");
		Collections.sort(list, new AgeComparator());
		for(Student s:list)
			System.out.println(s);
		
		System.out.println("Sorting by id");
		Collections.sort(list, new IdComparator());
		for(Student s:list)
			System.out.println(s);
	}

}
