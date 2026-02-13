package abstraction;

abstract class Shape{
	public abstract void area();
}

class Circle extends Shape{
	double radius;
	public Circle(double radius) {
		this.radius=radius;
	}
	public void area() {
		System.out.println("Area of circle: "+(Math.PI*radius*radius));
	}
}
class Rectangle extends Shape{
	double length;
	double breadth;
	public Rectangle(double length,double breadth) {
		this.breadth=breadth;
		this.length=length;
	}
	public void area() {
		System.out.println("Area of the rectangle : "+length*breadth);
	}
}


public class AbstractionMain {

	public static void main(String[] args) {
		Shape s;
		s=new Circle(5);
		s.area();
		
		s=new Rectangle(2,3);
		s.area();
	}

}
