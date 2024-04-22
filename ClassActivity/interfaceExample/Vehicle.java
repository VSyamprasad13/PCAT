package com.interfaceExample;

public class Vehicle implements Rental {
	static int noOfVehicle=2;
	protected String vehicleID;
	protected String make;
	protected String model;
	protected int year;
	protected double rentalPrice;
	
	public Vehicle(String vehicleID, String make, String model, int year, double rentalPrice) {
		this.vehicleID = vehicleID;
		this.make = make;
		this.model = model;
		this.year = year;
		this.rentalPrice = rentalPrice;
	}
	@Override
	public void reserve() {
		if(chechAvailability()) System.out.println("Reserved");
		else System.out.println("Not availble");
		
	}
	@Override
	public double rentalCost(int days) {
		return rentalPrice*days;
	}

	@Override
	public boolean chechAvailability() {
		if(noOfVehicle>0) {
			noOfVehicle--;
			return true;
		}
		else return false;
	}
}
