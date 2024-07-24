package basics;

public class DivisionException {
	static int div(String[] args) {
		int res = -1;

		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = a / b;
			res = 4;
		} catch (ArrayIndexOutOfBoundsException ae) {
			res = 5;
		} catch (NumberFormatException e) {
			res = 6;
		} catch (ArithmeticException e) {
			res = 7;
		}
		System.out.println("after try/catch");
		return res;
	}
}
