package test4;

class A {
	int x = 10;

	void m1() {
		System.out.println(this.x);
		// System.out.println(super.x);
	}
}

public class B extends A {
	int x = 20;

	void m2() {
		System.out.println(this.x);
		System.out.println(super.x);
	}

	public static void main(String[] args) {
		B b = new B();
		b.m1();
		b.m2();
	}

}
