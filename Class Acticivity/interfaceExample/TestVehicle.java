package com.interfaceExample;

public class TestVehicle {

	public static void main(String[] args) {
		Vehicle car = new Car("1983@12", "Ferrari", "Sedan", 1998, 1000.5, 5, "Petrol");
		car.reserve();
		double carCost = car.rentalCost(6);
		System.out.println("The rental cost for "+car.getClass().getSimpleName()+" is: "+carCost);
		
		Vehicle truck = new Truck("198A@12", "Truck","Ashok", 2019, 2590, 450.5, true);
		truck.reserve();
		double truckCost = truck.rentalCost(6);
		System.out.println("The rental cost for "+truck.getClass().getSimpleName()+" is: "+truckCost);
		
		Vehicle motorCycle=new MotorCycle("189!23","Bike", "Pulsar", 2020, 1550, 500.0, false);
		motorCycle.reserve();
		double cost = motorCycle.rentalCost(3);
		System.out.println("The rental cost for "+motorCycle.getClass().getSimpleName()+" is: "+cost);
		
	}

}
