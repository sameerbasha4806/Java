package inheritance;

class Student2{
	String name;
	String studentId;
	public Student2(String name, String studentId) {
		super();
		this.name = name;
		this.studentId = studentId;
	}
	
	public void displayStudentInfo() {
		System.out.println("Student Name: "+name);
		System.out.println("Student Id: "+studentId);
	}
}

class Undergraduate extends Student2{
	String major;
	
      public Undergraduate(String name, String studentId, String major) {
		super(name, studentId);
		this.major = major;
	}

	public void displayUndergraduateInfo() {
		System.out.println("Major In: "+major);
	}
}
class Graduate extends Student2{
	String thesisTopic;

	
	public Graduate(String name, String studentId, String thesisTopic) {
		super(name, studentId);
		this.thesisTopic = thesisTopic;
	}


	public void displayGraduateInfo() {
		System.out.println("Thesis topic : "+thesisTopic);
	}
	
	
}
class PhdStudent extends Student2{
	String researchArea;

	public PhdStudent(String name, String studentId, String researchArea) {
		super(name, studentId);
		this.researchArea = researchArea;
	}

	public void displayPhdStudentInfo() {
		System.out.println("Research area: "+researchArea);
	}
	
	
}

public class StudentHierarchy {

	public static void main(String[] args) {
		Student2 undergraduate=new Undergraduate("Alice", "U12345", "Computer Science ");
		undergraduate.displayStudentInfo();
		((Undergraduate)undergraduate).displayUndergraduateInfo();
		System.out.println("--------------------------------");
		Student2 graduate=new Graduate("Bob", "G67899", "Machine Learning");
		graduate.displayStudentInfo();
		((Graduate)graduate).displayGraduateInfo();
		System.out.println("-------------------------------");
		Student2 phdStudent=new PhdStudent("Charlie", "P11223", "Artificial Intelligence");
		phdStudent.displayStudentInfo();
		((PhdStudent)phdStudent).displayPhdStudentInfo();

	}

}
