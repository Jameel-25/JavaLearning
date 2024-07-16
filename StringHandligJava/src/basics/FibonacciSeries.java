package basics;

public class FibonacciSeries {
	public static void main(String[] args) {
		int n = 10;
		int firstTerm = 0, secondTerm = 1;
		System.out.print("Fibonacci Series: " + firstTerm + ", " + secondTerm);
		for (int i = 3; i <= n; ++i) {
			int nexTerm = firstTerm + secondTerm;
			System.out.print(", " + nexTerm);
			firstTerm = secondTerm;
			secondTerm = nexTerm;
		}

	}
}
