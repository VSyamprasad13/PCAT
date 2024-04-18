package com.employee1;

public class Employee1 {
	static String company="Wipro";
	static int no=100;
	private int empNo;
	private String name;
	private double salary;
	public Employee1(String name, double salary) {
		this.empNo=no++;
		this.name = name;
		this.salary = salary;
	}
	public int getempNo() {
		return empNo=no++;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee1 [empNo=" + empNo + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}
