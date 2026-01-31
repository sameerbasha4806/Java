package inheritance;

import java.util.Scanner;

class Vehicle{
	String ownerName;
	String vehicleName;
	String vehicleType;
	public Vehicle(String ownerName, String vehicleName, String vehicleType) {
		super();
		this.ownerName = ownerName;
		this.vehicleName = vehicleName;
		this.vehicleType = vehicleType;
	}
	public void profile() {
		System.out.println("Owner Name : "+ownerName);
		System.out.println("vehicle Name : "+vehicleName);
		System.out.println("vehicle type : "+vehicleType);
	}
	
	
}

class ServiceVehicle extends Vehicle{
	String centerName;
	String category;
	public ServiceVehicle(String ownerName, String vehicleName, String vehicleType, String centerName,
			String category) {
		super(ownerName, vehicleName, vehicleType);
		this.centerName = centerName;
		this.category = category;
		System.out.println("Vehicle profile has been created");
	}
	public void updatedCenterName(String newCenterName) {
		if(newCenterName==null || newCenterName.equals("")) {
			System.out.println("please enter valid details");
		}else {
		    centerName=newCenterName;
		    System.out.println("centerName updated");
		}
	}
	public void updatedCategory(String newCategory) {
		if(newCategory==null || newCategory.equals("")) {
			System.out.println("please enter valid details");
		}else {
			category=newCategory;
			System.out.println("category updated");
		}
	}
	public void profileDetails() {
		System.out.println("-----profile Details-----");
		System.out.println("center name : "+centerName);
		System.out.println("category : "+category);
		profile();
		
	}
	
}

public class VehicleManagementSystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter owner name: ");
		String name=sc.nextLine();
		System.out.println("vehicle name: ");
		String vehicleName=sc.nextLine();
		System.out.println("vehicle type: ");
		String vehicleType=sc.nextLine();
		System.out.println("center Name: ");
		String centerName=sc.nextLine();
		System.out.println("category: ");
		String category=sc.nextLine();
		
		ServiceVehicle obj =new ServiceVehicle(name,vehicleName,vehicleType,centerName,category);
		
		int choice=0;
		boolean status=true;
		while(status) {
			System.out.println("Provide a menu to perform the following operations:\r\n"
					+ "1. Update Service Category\r\n"
					+ "2. Update Service Center Name\r\n"
					+ "3. View Vehicle Profile Details\r\n"
					+ "4. Exit the program\r\n"
					+ "");
			choice=sc.nextInt(); 
			sc.nextLine();
			switch(choice) {
			case 1:{
				System.out.println("updated service category");
				String servicecategory=sc.nextLine();
				obj.updatedCategory(servicecategory);
				break;
			}
			case 2:{
				System.out.println("updated service centername");
				String servicecenter=sc.nextLine();
				obj.updatedCenterName(servicecenter);
				break;
			}
			case 3:{
				obj.profileDetails();
				break;
			}
			case 4:{
				System.out.println("Exit the program");
				status=false;
				break;
			}
			default:
				System.out.println("invalid choice");
				break;
			}				
			
		}
			
		sc.close();
		

	}

}
