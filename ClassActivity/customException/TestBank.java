package com.customException;

public class TestBank {

	public static void main(String[] args) {
		Bank bank=new Bank("628681ABC", "David", 9879.7);
		bank.withdraw(10000);
//		System.out.println(bank.getBalance());
	}
	

}
