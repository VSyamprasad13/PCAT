package com.stringExercise;


public class Employee {
	private int id;
	private String Name;
	private double salary;
	
	public Employee() {}
	public Employee(int id, String Name, double salary) {
	this.id = id;
	this.Name = Name;
	this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public double isSalary() {
		return salary;
	}
	public void setSalary(double d) {
		this.salary = d;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", eName=" + Name + ", salary=" + salary + "]";
	}
	
	
}
