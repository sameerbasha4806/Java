package inheritance;

import inheritance.Circle;
import inheritance.Rectangle;
import inheritance.Shape;
import inheritance.Triangle;

class Shape{
	public Shape() {
	}
	public void calculateArea() {
		System.out.println("calculate Area: ");
	}
	
}
class Circle extends Shape{
	double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	public void calculateCircleArea() {
		double circleArea=radius*radius*Math.PI;
		if(radius<0) {
			System.out.println("the radius value must be positive");
		}
		else {
			System.out.println("Area of Circle : "+circleArea);
		}
		
	
//		System.out.println("circle area: "+radius*radius*3.14);
    }


}
class Rectangle extends Shape{
	double length;
	double width;
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	public void calculateRectangleArea() {
		if(length<0 && width<0) {
			System.out.println("Values must be in postive");
		}else {
			System.out.println("Area of rectangle: "+length*width);
		}
		
	}
}
class Triangle extends Shape{
	double base;
	double height;
	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}
	public void calculateTriangleArea() {
		if(base<0 && height<0) {
			System.out.println("the values must be in positive");
		}else {
			System.out.println("Area of triangle: "+0.5*base*height);
		}
		
	}
}


public class ShapeHierarchy {

	public static void main(String[] args) {
		Shape circle=new Circle(5.0);
		circle.calculateArea();
		((Circle)circle).calculateCircleArea();
		System.out.println("--------------------");
		Shape rectangle=new Rectangle(4, 6);
		rectangle.calculateArea();
		((Rectangle)rectangle).calculateRectangleArea();
		System.out.println("-----------------------");
		Shape triangle=new Triangle(3, 7);
		triangle.calculateArea();
		((Triangle)triangle).calculateTriangleArea();
	}

}

