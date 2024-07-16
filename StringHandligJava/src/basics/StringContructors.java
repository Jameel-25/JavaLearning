package basics;

public class StringContructors {
	public static void main(String[] args) {
		String s1 = new String();
		System.out.println(s1);

		String s2 = "abc";
		// String copy
		String s3 = new String(s2);

		// creating string with direct string literal
		String s4 = new String("bbc");

		// String assignment
		String s5 = s4;

		System.out.println("s2:" + s2);// abc
		System.out.println("s3:" + s3);
		;// abc
		System.out.println("s4:" + s4);// bbc

		System.out.println(s2 == s3);// false
		System.out.println(s4 == s5);// true

		StringBuffer sb = new StringBuffer("Jameel");
		System.out.println(sb);

		StringBuilder sbb = new StringBuilder("Mohammed Jameel");
		System.out.println(sbb);

		char[] ch = { 'a', 'b', 'c', 'd', 'e', 'f' };
		String s6 = new String(ch);
		System.out.println("s6:" + s6);

		// String(char[] ch, int offset, int count)
		char[] ch2 = { 'a', 'b', 'c', 'd', 'e', 'f' };
		String s7 = new String(ch, 2, 3);// int offset:begin index,count: counting index how many
		System.out.println("s7:" + s7);

		byte[] b = { 97, 98, 99 };
		String s8 = new String(b);// abc
		System.out.println("s8:"+s8);// abc

		byte[] b2 = { 97, 98, 99 };
		String s9 = new String(b, 1, 1);
		System.out.println("s9:"+s9);//b

	}
}
