package com.collectionsExamples;

import java.util.ArrayList;

public class ArrayListEmployee {

	public static void main(String[] args) {
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(100,"David", 100000));
		list.add(new Employee(101, "James", 80000));
		list.add( new Employee(102, "Mira", 15000));
		for(Employee e:list)
			e.incrementSalary(10);

		for(Employee e:list)
			System.out.println(e);
	}

}
