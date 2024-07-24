package basics;

public class Example2 {
	public static void main(String[] args) {
		m1();
		System.out.println("After m1 calling");
	}

	static void m1() {
		try {
			System.out.println("In try");
			System.out.println(10 / 0);
		} catch (NullPointerException e) {
			System.out.println("In Catch");
		} finally {
			System.out.println("In finally");
			return;
		}
	}
}
