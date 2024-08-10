package test2;

public class B3 extends A3 {

	int y = 20;

	{
		System.out.println("B NSB");
		System.out.println("x:" + x);
		System.out.println("y:" + y);
	}

	B3() {
		System.out.println("B3 Constructor");
		y = 6;
	}

	public static void main(String[] args) {
		System.out.println("B main");

		B3 b3 = new B3();
		System.out.println("x:" + b3.x);
		System.out.println("y:" + b3.y);
	}

}
