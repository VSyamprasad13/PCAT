package com.switchEmployee;

public class TestEmployee {

	public static void main(String[] args) {
		Employee e1=new Employee("Syam", EmployeeType.MANAGER);
		Employee e2=new Employee("David", EmployeeType.ENGINEER);
		Employee e3=new Employee("James", EmployeeType.SALESPERSON);
		
		e1.performDuties();
		e2.performDuties();
		e3.performDuties();
	}

}
