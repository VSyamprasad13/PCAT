package com.switchEmployee;

public class Employee {
	private String name;
	private EmployeeType type;
	public Employee(String name, EmployeeType type) {
		this.name = name;
		this.type = type;
	}
	
	public void performDuties() {
		switch(type){
		case MANAGER: 
			System.out.println(name+" is managing the team");
			break;
		case ENGINEER:
			System.out.println(name+" is coding");
			break;
		case SALESPERSON:
			System.out.println(name+" is selling the products");
			break;
		default: System.out.println("Invalid employee type");
		}
	}
	
	
}
