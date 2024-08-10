package test2;

public class A3 {
	int x = 10;

	{
		System.out.println("A NSB");
		System.out.println("x:" + x);
	}

	A3() {
		System.out.println("A Constructor");
		x = 5;
	}

}
