package oopsBasic;

class ExamplePoly {
	void m1() {
		System.out.println("ExamplePoly m1");
	}

	void m2() {
		System.out.println("ExamplePoly m2");
	}
}

public class SamplePoly extends ExamplePoly {
	void m1() {
		System.out.println("SamplePoly m1");
	}

	public static void main(String[] args) {
		SamplePoly s = new SamplePoly();
		s.m1();
		s.m2();

		ExamplePoly e = new SamplePoly();// Upcasting

		e.m1();
		e.m2();
	}

}
