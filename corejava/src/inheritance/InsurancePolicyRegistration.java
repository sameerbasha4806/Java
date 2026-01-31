package inheritance;

import java.util.Scanner;

class InsurancePolicy{
	 String customerName;
	 String policyType;
	 int policyAmount;
	 int approvedAmount;
	 String policyStatus;
	 
	 
	 public InsurancePolicy(String customerName, String policyType, int policyAmount) {

		this.customerName = customerName;
		this.policyType = policyType;
		this.policyAmount = policyAmount;
		this.approvedAmount=0;
		this.policyStatus="pending";
		System.out.println("policy profile created");
	}

	 public InsurancePolicy(String customerName, String policyType, int policyAmount, int approvedAmount,
			String policyStatus) {
		super();
		this.customerName = customerName;
		this.policyType = policyType;
		this.policyAmount = policyAmount;
		this.approvedAmount = approvedAmount;
		this.policyStatus = policyStatus;
		System.out.println("policy has been created");
	 }
	 
	 public void updatedApprovedAmount(int newApprovedAmount) {
		 if(newApprovedAmount<0 || newApprovedAmount> policyAmount) {
			 System.out.println("Enter valid values");
			 
		 }else {
			 System.out.println("successfully updated: ");
			 approvedAmount=newApprovedAmount;
		 }
	 }
	 public void changePolicyStatus(String newPolicyStatus) {
		 if(newPolicyStatus==null || newPolicyStatus.equals("")) {
			 System.out.println("Enter valid values");
			 
		 }else {
			 System.out.println("Successfully changed policy status : ");
			 policyStatus=newPolicyStatus;
		 }
	 }
	 public void viewPolicySummary() {
		 System.out.println("Customer Name: "+customerName);
		 System.out.println("policy type : "+policyType);
		 System.out.println("policy amount : "+policyAmount);
		 System.out.println("Approved amount : "+approvedAmount);
		 System.out.println("policy status : "+policyStatus);
	 }
	 
	 
	 
}

public class InsurancePolicyRegistration {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter customer name: ");
		String name=sc.nextLine();
		System.out.println("enter policy type: ");
		String policy=sc.nextLine();
		System.out.println("enter policy amount: ");
		int amount =sc.nextInt();
		System.out.println(" approved amount: ");
		int approved =sc.nextInt();
		sc.nextLine();
		System.out.println(" policy status : ");
		String policys=sc.nextLine();
		
		InsurancePolicy ip=new InsurancePolicy(name,policy,amount);
		
		
		boolean status=true;
		while(status) {
			System.out.println("Provide a menu to perform the following operations:\r\n"
					+ "1. Update Approved Amount:\r\n"
					+ "2. Change Policy Status:\r\n"
					+ "3. View Policy Summary:\r\n"
					+ "4. Exit the program:\r\n"
					+ "");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:{
				System.out.println("Updated approved amount : ");
				int approvedamount =sc.nextInt();
				ip.updatedApprovedAmount(approvedamount);
				break;
				}
			
			case 2:{
				sc.nextLine();
				System.out.println("enter policy status : ");
				
				String policystatus =sc.nextLine();
				ip.changePolicyStatus(policystatus);
				break;		
			}
			case 3:{
				System.out.println(" policy summary : ");
				ip.viewPolicySummary();		
				break;
			}
		
			case 4:{
				System.out.println(" Thank you visit again : ");
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
