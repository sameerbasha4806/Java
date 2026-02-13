package com.abstraction;

public class VehicleMain {

	public static void main(String[] args) {
		Vehicle vh;
		vh=new Car("Toyota camry", "ABC123", "Toyota", 4, true);
		vh.startEngine();
		vh.fuelType();
		System.out.println("--------------------------");
		vh=new Bike("Yamaha", "AP10BA1174", "splendor", false);
		vh.startEngine();
		vh.fuelType();
		System.out.println("--------------------------");
		vh=new Truck("volvo", "OP10BA8888", "VOLVO", 388888);
		vh.startEngine();
		vh.fuelType();

	}

}
