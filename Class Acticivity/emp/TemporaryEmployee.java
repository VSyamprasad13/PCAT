package com.emp;

public class TemporaryEmployee extends Emplyee {
	private double bonus;

	public TemporaryEmployee(String name, double salary, double bonus) {
		super(name, salary);
		this.bonus = bonus;
	}
	public void calculateBonus() {
		double sal=salary*bonus/100;
		salWithBonus(sal);
	}
	public void displayEmpInfo() {
		System.out.println("Employee ID: "+iD
				+"\nEmployee name: "+name
				+"\nEmployee salary: "+salary);
	}
}
