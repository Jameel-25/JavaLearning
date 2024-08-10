package test3;
class Example3{
	 Example3() {
		System.out.println("Example3 no-arg private Constructor");
	}
}
public class Sample3 extends Example3 {
	Sample3(){
		
		System.out.println("Sample3 no-arg");
	}
	
	public static void main(String[] args) {
		new Sample3();
	}

}
