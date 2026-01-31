package inheritance;

class SalesEmployee{
	String employeeName;
	int employeeId;
	public SalesEmployee(String employeeName, int employeeId) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
	}
	
	
}
class PerformanceEmployee extends SalesEmployee{
	int salesEntries;
	int totalSales;
	double averageSales;
	String performanceGrade;
	public PerformanceEmployee(String employeeName, int employeeId, int salesEntries, int totalSales,
			double averageSales, String performanceGrade) {
		super(employeeName, employeeId);
		this.salesEntries = salesEntries;
		this.totalSales = totalSales;
		this.averageSales = averageSales;
		this.performanceGrade = performanceGrade;
		System.out.println("profile has been generated");
	}
	
	
	
}

public class SalesTrackingSystem {

	public static void main(String[] args) {
		

	}

}
