package com.employee;

public class TestEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee(100, "Syam", 10000);
		Employee e2 = new Employee();
		e2.setId(101);
		e2.setName("David");
		e2.setSalary(1000);

		switch(e1.getName()) {
			case "Syam":
				System.out.println("id of the employee is: "+e1.getId());
				break;
			case "David":
				System.out.println("id of the employee is: "+e1.getId());
				break;
		}
	}
}
