package finalPackage;

public class Sample extends Example {
	void m1() {
		System.out.println("Sample m1");
	}

	void m22() {
		System.out.println("Sample m2");
	}

	public static void main(String[] args) {
		Sample s = new Sample();
		s.m1();
		s.m22();
		s.m3();
	}

}
