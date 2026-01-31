package inheritance;

class Employee1{
	String name;
	double baseSalary;
	public Employee1(String name, double baseSalary) {
		this.name = name;
		this.baseSalary = baseSalary;
	}
	
	
	public void calculateAnnualSalary() {
		System.out.println("Name :"+this.name);
		System.out.println("Annual Salary: "+this.baseSalary*12);
	}
}
class Manager1 extends Employee1{
	double bonus;
	int numberOfEmployeeManaged;
	
	public Manager1(String name,double baseSalary,double bonus, int numberOfEmployeeManaged) {
		super(name,baseSalary+bonus);
		this.bonus = bonus;
		this.numberOfEmployeeManaged = numberOfEmployeeManaged;
	}
	
	public void calculateManagerSalary() {
		System.out.println("manager Salary: "+super.baseSalary*12);
	}

}
class Engineer extends Employee1{
	int projectCount;

	public Engineer(String name, double baseSalary, int projectCount) {
		super(name, baseSalary+(projectCount *1000));
		this.projectCount = projectCount;
	}

	public void calculateEngineerSalary() {
		System.out.println("Calculate engineer salary: "+super.baseSalary*12);
	}
	
}
class SalesPerson extends Employee1{
	double commissionRate;
	int totalRates;
	public SalesPerson(String name, double baseSalary, double commissionRate, int totalRates) {
		super(name, baseSalary+(commissionRate*totalRates));
		this.commissionRate = commissionRate;
		this.totalRates = totalRates;
	}
	
	public void calculateSalesPersonSalary() {
		System.out.println("Sales person salary: "+super.baseSalary*12);
	}
}

public class EmployeeHierarchy {

	public static void main(String[] args) {
		Employee1 manager=new Manager1("Alice", 50000.0, 10000.0, 5);
		manager.calculateAnnualSalary();
		((Manager1)manager).calculateManagerSalary();
		System.out.println("-------------------------");
		Employee1 engineer =new Engineer("Bob", 70000, 5);
		engineer.calculateAnnualSalary();
		((Engineer)engineer).calculateEngineerSalary();
		System.out.println("----------------------------------");
		Employee1 sales=new SalesPerson("Charlie", 40000, 0.1, 200000);
		sales.calculateAnnualSalary();
		((SalesPerson)sales).calculateSalesPersonSalary();
	}

}
