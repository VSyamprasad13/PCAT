package com.customException;

public class TestEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee(100, "Syam", 1000);
		Employee e2 = new Employee();
		e2.setId(101);
		e2.setName("David");
		e2.setSalary(1000);

		try {
			if(e1.isSalary()<10000) 
				throw new InvalidSalaryException("Salary cannot be withdrawn");
			else System.out.println("Done");
		}catch (InvalidSalaryException e) {
			System.out.println("Salary has to be more");
//			System.out.println(e.getMessage());
		}
	}
}
