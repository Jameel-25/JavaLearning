package oopsBasic;

class Rectangle implements Shape {
	private double l;
	private double b;

	public Rectangle(double l, double b) {
		super();
		this.l = l;
		this.b = b;
	}

	public void area() {
		System.out.println("Rectangle area:" + (l * b));
	}

	public void perimeter() {
		System.out.println("Rectangle perimeter:" + 2 * (l + b));
	}

	public void printLB() {
		System.out.println("L:" + l);
		System.out.println("B:" + b);
	}

}

class Square implements Shape {
	private double s;

	public Square(double s) {
		this.s = s;
	}

	public void area() {
		System.out.println("Square area:" + (s * s));
	}

	public void perimeter() {
		System.out.println("Square perimeter:" + (s * 4));
	}

	public void printS() {
		System.out.println("s:" + s);
	}

}

class Circle implements Shape {
	public static final float PI = 3.14f;
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public void area() {
		System.out.println("Circle area:" + (2 * PI * radius));
	}

	public void perimeter() {
		System.out.println("Circle perimeter:" + (2 * PI * radius));
	}

	public void printRadius() {
		System.out.println("Radius:" + radius);
	}
}

public class MainAbPoly {
	public static void main(String[] args) {
		Shape s;
	}
}
