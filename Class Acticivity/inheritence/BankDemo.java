package com.inheritence;

public class BankDemo {

	public static void main(String[] args) {
		SavingsAccount acc=new SavingsAccount("ABC123456", "David", 19282, 7.2);
		
		acc.deposit(1000);
		acc.interest();
		acc.displayAccountInfo();
		acc.withdrawMoney(5000);
	}

}
