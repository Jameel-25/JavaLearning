package oopsBasic;

class ExampleEncp {
	private int a;

	public void setA(int a) {
		if (a > 0) {
			this.a = a;
		} else {
			System.out.println("Do not pass negative number");
		}
	}

	public int getA() {
		return a;
	}
}

public class SampleEncp {
	public static void main(String[] args) {
		ExampleEncp e = new ExampleEncp();
		e.setA(50);
		System.out.println(e.getA());

		e.setA(-7);
		System.out.println(e.getA());
	}
}
