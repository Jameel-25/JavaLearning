package basics;

public class GCD {
	public static void main(String[] args) {
		int a = 56, b = 98;
		System.out.println("GCD of " + a + " and " + b + " is " + findGCD(a, b));
	}

	public static int findGCD(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
}
