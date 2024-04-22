package com.customException;

public class Bank {
	static int minBalance=1000;
	private String accNo;
	private String accHolder;
	private double balance;
	public Bank(String accNo, String accHolder, double balance) {
		super();
		this.accNo = accNo;
		this.accHolder = accHolder;
		this.balance = balance;
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void deposit(double money) {
		balance+=money;
	}
	public void withdraw(int money) {
		try {
			if(money>balance)
				throw new InsufficientBalanceException("Insufficient funds");
			else
				balance-=money;
		}catch (InsufficientBalanceException e) {
				System.out.println("Insufficient funds in the account");
		}
	}
	@Override
	public String toString() {
		return "Bank [accNo=" + accNo + ", accHolder=" + accHolder + ", salary=" + balance + "]";
	}
	

}
