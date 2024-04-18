package com.interfaceExample;

public class Truck extends Vehicle {
	private double cargoCapacity;
	private boolean isRentedWithDriver;
	public Truck(String vehicleID, String make, String model, int year, double rentalPrice, double cargoCapacity,
			boolean isRentedWithDriver) {
		super(vehicleID, make, model, year, rentalPrice);
		this.cargoCapacity = cargoCapacity;
		this.isRentedWithDriver = isRentedWithDriver;
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
