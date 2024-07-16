package basics;

public class StringPooling {
	public static void main(String[] args) {
		String s1 = "a";
		String s2 = "a";
		System.out.println(s1 == s2);// true
		System.out.println(s1.equals(s2));// true

		String s3 = new String("a");
		String s4 = new String("a");
		System.out.println(s3 == s4);// false
		System.out.println(s3.equals(s4));// true

	}
}
