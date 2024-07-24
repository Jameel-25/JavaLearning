package basics;

public class Example5 {
	public static void main(String[] args) {
		System.out.println(m1());

	}

	static int m1() {
		try {
			System.out.println("In ourter try");
			try {
				System.out.println("In inner try");
			} catch (NullPointerException e) {
				System.out.println("In Inner catch");
			} finally {
				System.out.println("In inner finally");
				return 10;
			}

			// System.out.println("After inner tyr/catch/finally");
		} catch (NullPointerException e) {
			System.out.println("In outer catch");
		} finally {
			System.out.println("In outer finally");
		}

		System.out.println("After outer try/catch/finally");
		return 30;
	}

}
