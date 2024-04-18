package com.inheritence;

public class Account {
	protected String accNo;
	protected String holderName;
	protected double balance;
	
	public Account(String accNo, String holderName, double balance) {
		this.accNo = accNo;
		this.holderName = holderName;
		this.balance = balance;
	}

	public void displayAccountInfo() {
		System.out.println("Account Number: "+accNo
				+"\nHolder name: "+holderName
				+"\nBalance: "+balance);
	}
	public void deposit(double money) {
		balance+=money;
	}
	public void withdrawMoney(int money) {
		if(money>balance) 
			System.out.println("Cannot be withdrawn");
		else {
			balance-=money;
			System.out.println(money+" withdraw done"
					+ "\nRemaining balance: "+balance);
		}
	}
	
	
}
