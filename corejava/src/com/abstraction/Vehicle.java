package com.abstraction;

public abstract class Vehicle {
	String modelName,vehicleNumber,company;
	
	
	public Vehicle(String modelName, String vehicleNumber, String company) {
		super();
		this.modelName = modelName;
		this.vehicleNumber = vehicleNumber;
		this.company = company;
	}


	public abstract void startEngine();
	
	public void fuelType() {
		System.out.println("Petrol");
	}

}
