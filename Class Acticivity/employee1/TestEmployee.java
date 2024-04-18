package com.employee1;

public class TestEmployee {
	public static void main(String[] args) {
		Employee1[] emp=new Employee1[2];
		emp[0]=new Employee1("Syam", 18157);
		emp[1]=new Employee1("David", 6875);
		
		System.out.println("Employee object1 "+emp[0]);
		System.out.println("Employee object2 "+emp[1]);
		
		
	}
}
