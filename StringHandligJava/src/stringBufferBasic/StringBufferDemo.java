package stringBufferBasic;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		System.out.println("sb1: " + sb1);// sb1
		System.out.println("sb1 Capacity: " + sb1.capacity());
		
		StringBuffer sb2 = new StringBuffer("a");
		System.out.println("sb2 capacity: "+sb2.capacity());
	}

}
