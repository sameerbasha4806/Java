package com.abstraction;

public class Truck extends Vehicle{
	Integer cargoCapacity;

	public Truck(String modelName, String vehicleNumber, String company, Integer cargoCapacity) {
		super(modelName, vehicleNumber, company);
		this.cargoCapacity = cargoCapacity;
	}

	public void startEngine() {
		System.out.println("Starting Engine with heavy-load warm-up");
	}
	public void fuelType() {
		System.out.println("Diesel");
	}

}
