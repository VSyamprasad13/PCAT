package com.inheritence;

public class SavingsAccount extends Account {
	private double interestRate;

	public SavingsAccount(String accNo, String holderName, double balance, double interestRate) {
		super(accNo, holderName, balance);
		this.interestRate = interestRate;
	}
	
	public void interest() {
		double interest=(balance*interestRate/100);
		deposit(interest);
	}
}
