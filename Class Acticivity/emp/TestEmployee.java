package com.emp;

public class TestEmployee {

	public static void main(String[] args) {
		PermanentEmployee e1 = new PermanentEmployee("Syam", 10000, 10);
		e1.calculateBonus();
		e1.displayEmpInfo();
		TemporaryEmployee e2 = new TemporaryEmployee("David", 8000, 2);
		e2.calculateBonus();
		e2.displayEmpInfo();
	}

}
