package basics;

public class FinallyReturn {
	public static void main(String[] args) {
		System.out.println(m1());
	}

	static int m1() {
		try {
			System.out.println("In try");
			System.out.println(10 / 0);
		} catch (NullPointerException e) {
			System.err.println("In catch");
			return 20;
		} finally {
			System.out.println("In finally");
			return 30;
		}
	}
}
