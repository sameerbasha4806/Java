package com.abstraction;

public class Bike extends Vehicle{
	boolean hasSideCar;

	public Bike(String modelName, String vehicleNumber, String company, boolean hasSideCar) {
		super(modelName, vehicleNumber, company);
		this.hasSideCar = hasSideCar;
	}
	public void startEngine() {
		System.out.println("Starting engine with kick-start");
	}
	

}
