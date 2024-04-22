package com.interfaceExample;

public class MotorCycle extends Vehicle {
	private double engineDisplacement;
	private boolean isHelmetProvided;
	public MotorCycle(String vehicleID, String make, String model, int year, double rentalPrice,
			double engineDisplacement, boolean isHelmetProvided) {
		super(vehicleID, make, model, year, rentalPrice);
		this.engineDisplacement = engineDisplacement;
		this.isHelmetProvided = isHelmetProvided;
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
