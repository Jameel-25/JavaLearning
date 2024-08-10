package test3;

public class Sample extends Example {
	Sample() {
		System.out.println("Sa no-arg");
	}

	Sample(int a) {
		//super(50);
		System.out.println("Sa int-arg");
	}

	public static void main(String[] args) {
		new Sample();
		new Sample(10);
	}

}
