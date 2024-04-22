package com.emp;

public class Emplyee {
	static int no=100;
	protected int iD;
	protected String name;
	protected double salary;
	public Emplyee(String name, double salary) {
		this.iD = no++;
		this.name = name;
		this.salary = salary;
	}
	public void salWithBonus(double bonus) {
		salary+=bonus;
	}
	
}
