package basics;

public class InnerTryDemo {
	public static void main(String[] args) {
		try {
			System.out.println("In outer try");
			try {
				System.out.println("In inner try");
				System.out.println(10 / 0);
			} catch (ArithmeticException nas) {
				System.out.println("In inner catch");
			}
			System.out.println("After inner tyr/catch");
		} catch (ArithmeticException nas) {
			System.out.println("In Outer catch");
		}
		System.out.println("After outer try/catch");
	}
}
