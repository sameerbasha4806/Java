package inheritance;

class Vehicle1{
	String make;
	String model;
	int year;
	public Vehicle1(String make, String model, int year) {
	
		this.make = make;
		this.model = model;
		this.year = year;
	}
	public void displayInfo() {
		System.out.println("make: "+this.make);
		System.out.println("Model: "+this.model);
		System.out.println("year : "+this.year);
	}
	
}
class Car1 extends Vehicle1{
	int numberOfDoors;

	public Car1(String make, String model, int year, int numberOfDoors) {
		super(make, model, year);
		this.numberOfDoors = numberOfDoors;
	}
	public void displayCarInfo() {
		System.out.println("make: "+this.make);
		System.out.println("Model: "+this.model);
		System.out.println("year : "+this.year);
		System.out.println(" Number of Doors : "+this.numberOfDoors);
	}
		
}
class Truck extends Car1{
	int cargoCapacity;

	public Truck(String make, String model, int year, int numberOfDoors, int cargoCapacity) {
		super(make, model, year, numberOfDoors);
		this.cargoCapacity = cargoCapacity;
	}
	
	public void displayTruckInfo() {
		System.out.println("make: "+this.make);
		System.out.println("Model: "+this.model);
		System.out.println("year : "+this.year);
//		System.out.println(" Number of Doors : "+this.numberOfDoors);
		System.out.println(" cargoCapacity: "+this.cargoCapacity);
	}
	
	
}
class Motorcycle extends Truck{
	boolean hasSideCar;

	public Motorcycle(String make, String model, int year, int numberOfDoors,int cargoCapacity, boolean hasSideCar) {
		super(make, model, year, numberOfDoors,cargoCapacity);
		this.hasSideCar = hasSideCar;
	}
	
	public void displayMotorcycleInfo() {
		System.out.println("make: "+this.make);
		System.out.println("Model: "+this.model);
		System.out.println("year : "+this.year);
		System.out.println(" Number of Doors : "+this.numberOfDoors);
		System.out.println(" cargoCapacity: "+this.cargoCapacity);
		System.out.println(" has SideCar: "+this.hasSideCar);
	}
	
	
}


public class VehicleHierarchy {

	public static void main(String[] args) {
//		Vehicle vh=new Car("Toyota","Carolla",2021,4);
//		vh.displayInfo();
//		Car car=(Car)vh;
//		
		Vehicle1 vh=new Car1("Toyota", "Carolla",2021, 4);
		vh.displayInfo();
		System.out.println("-----------------------");
		Car1 car=(Car1)vh;
		car.displayCarInfo();
		System.out.println("-----------------------");
		
		Vehicle1 vh2=new Truck("Ford", "F-150", 2000, 4, 1000);
		Truck truck=(Truck)vh2;
		truck.displayTruckInfo();
		System.out.println("--------------------------");
//		Vehicle1 vh3=new Motorcycle("Marley-Davidson", "Street Glide", 2023, 4, 1000,true);
//		Motorcycle mc=(Motorcycle)vh3;
//		mc.displayMotorcycleInfo();
//		System.out.println("--------------------------");
		Vehicle1 motorcycle =new Motorcycle("Marley-Davidson", "Street Glide", 2023, 4,1000,true);
         motorcycle.displayInfo();
         System.out.println("-------------------------------------");
         ((Motorcycle) motorcycle).displayMotorcycleInfo();
	}

}
