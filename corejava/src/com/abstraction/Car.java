package com.abstraction;

public class Car extends Vehicle{
	
	Integer numberofDoors;
	boolean hasSunroof;
	
	public Car(String modelName, String vehicleNumber, String company, Integer numberofDoors, boolean hasSunroof) {
		super(modelName, vehicleNumber, company);
		this.numberofDoors = numberofDoors;
		this.hasSunroof = hasSunroof;
	}
	
	public void startEngine() {
		System.out.println("Starting engine with key ignition");
		
	}

}
