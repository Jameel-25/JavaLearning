package basics;

public class TryCatchFinallyy {
	public static void main(String[] args) {
		try {
			System.out.println("In try");
		} catch (ArithmeticException e) {

			System.out.println("In catch");
		} finally {
			System.out.println("In finally");
		}
		System.out.println("After try/catch/finally");
	}
}
