package stringBufferBasic;

public class StringBufferOperations {
	public static void main(String[] args) {

		// append
		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = sb1.append("d");

		System.out.println(sb1);// abcd
		System.out.println(sb2);// abcd
		System.out.println(sb1 == sb2);// true

		// insert
		StringBuffer sb3 = new StringBuffer("2942011");
		System.out.println(sb3);// 2942011
		sb3.insert(2, '/');
		System.out.println(sb3);// 29/42011

		sb3.insert(4, '/');
		System.out.println(sb3);// 29/4/2011

		// delete
		StringBuffer sb4 = new StringBuffer("Jameel xyz Mohammed");
		System.out.println(sb4);// Jameel xyz Mohammed

		sb4.delete(sb4.indexOf("xyz"), sb4.indexOf("xyz") + 4);
		System.out.println(sb4);

		sb4.deleteCharAt(4);
		sb4.deleteCharAt(4);
		System.out.println(sb4);

		// reverse
		StringBuffer sb5 = new StringBuffer("abc");
		System.out.println(sb5);// abc

		sb5.reverse();
		System.out.println(sb5);// cba

		// capacity() and lenght()
		// public int capactiy()
		// public int length()

		StringBuffer sb6 = new StringBuffer();
		System.out.println(sb6);
		System.out.println(sb6.capacity());// 16
		System.out.println(sb6.length());// 0

		sb6.insert(0, "abc");
		System.out.println(sb6);// abc
		System.out.println(sb6.capacity());// 16
		System.out.println(sb6.length());// 3

		StringBuffer sb7 = new StringBuffer("abc");
		System.out.println(sb7);
		System.out.println(sb7.capacity());// 19
		System.out.println(sb7.length());//3
		
	}
}
