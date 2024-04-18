package com.polymorphism;

public class TestBank {

	public static void main(String[] args) {
		Bank bank;
		
		bank = new SBI();
		System.out.println("The rate of interest of "+bank.getClass().getSimpleName()+""
				+ " is "+bank.getRateOfInterest());
		bank=new ICICI();
		System.out.println("The rate of interest of "+bank.getClass().getSimpleName()+" "
				+ "is "+bank.getRateOfInterest());
	}

}
