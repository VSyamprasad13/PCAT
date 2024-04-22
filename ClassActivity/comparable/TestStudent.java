package com.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class TestStudent {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(new Student(100, "David", 23));
		list.add(new Student(101, "Jon", 21));
		list.add(new Student(102, "Doe", 22));
		
		Collections.sort(list);
		
		for(Student s:list)
			System.out.println(s);
	}

}
