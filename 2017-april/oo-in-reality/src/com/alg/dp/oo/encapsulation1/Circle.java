package com.alg.dp.oo.encapsulation1;

//data level encapsulation
public class Circle {
	//hide the data. why?
	//if we change radius to diameter also then clients code will not be impacted
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double area() {
		return Math.PI * radius * radius;
	}
	
	public double perimeter() {
		return 2 * Math.PI * radius;
	}
}
class Test {
	public static void main(String[] args) {
		//we can create any number of circle type objects using circle class
		Circle c1 = new Circle(10.2);
		System.out.println(c1.area());
		System.out.println(c1.perimeter());
		
		Circle c2 = new Circle(10.2);
		System.out.println(c2.area());
		System.out.println(c2.perimeter());
		
	}
}
