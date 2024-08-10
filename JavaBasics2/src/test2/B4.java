package test2;

public class B4 extends A4 {
	static int b = 20;
	int y = 40;

	B4() {

		System.out.println("B class construcotr");
		y = 6;
	}

	public static void main(String[] args) {
		B4 b = new B4();
		System.out.println(a);
		System.out.println(b);
		System.out.println(b.x);
		System.out.println(b.y);
	}

}
