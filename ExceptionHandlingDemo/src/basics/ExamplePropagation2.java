package basics;

public class ExamplePropagation2 {
	public static void main(String[] args) {
		System.out.println("In main method start");
		try {
			m1();
		} catch (ArithmeticException e) {
			System.out.println("In main catch");
		}
		System.out.println("In main method end");
	}

	static void m1() {
		System.out.println("In m1 method start");
		System.out.println(10 / 0);
		System.out.println("In m1 method end");
	}
}
