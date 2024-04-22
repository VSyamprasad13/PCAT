package com.interfaceExample;

public class Car extends Vehicle {
	private int noOfSeats;
	private String fuelType;
	public Car(String vehicleID, String make, String model, int year, double rentalPrice, int noOfSeats,
			String fuelType) {
		super(vehicleID, make, model, year, rentalPrice);
		this.noOfSeats = noOfSeats;
		this.fuelType = fuelType;
	}
	
	@Override
	public double rentalCost(int days) {
		return rentalPrice*days;
	}
	@Override
	public void reserve() {
		
		super.reserve();
	}
	
}
