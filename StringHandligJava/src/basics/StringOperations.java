package basics;

public class StringOperations {
	public static void main(String[] args) {
		String s = "Java Programming Language";

		// finding string is empty or not
		System.out.println(s.isEmpty());
		System.out.println(s.isBlank());

		// finding length of the string
		System.out.println(s.length());

//		String s1="";
//		String s2=" ";
//		String s3 = new String("");
//		System.out.println(s1.isEmpty());
//		System.out.println(s1.isBlank());
//		System.out.println(s2.isEmpty());

		// printing string object
		System.out.println(s);

		// comparing two string
		String s1 = new String("abc");
		String s2 = new String("abc");
		String s3 = new String("Abc");
		System.out.println(s1 == s2);// false => different references
		System.out.println(s1.equals(s2));// true => both objects has same state

		System.out.println(s2 == s3);// false=>different references
		System.out.println(s2.equals(s3));// false =>both objects has different state

		// comparing string without case, below method is defined is defined in string
		// class
		// public boolean equalsIgnoreCase(String s)
		String s4 = new String("a");
		String s5 = new String("A");
		System.out.println(s4.equals(s5));// false=>compares with case
		System.out.println(s4.equalsIgnoreCase(s5));// true=>compares without case

		// comparing strings lexicographically, means after comparison method should
		// return difference between string, content
		// public int compareTo(String s) =>compares strings with case
		// public int comapreToIgnoreCae(String s) => compares Strings without case

		String s6 = new String("a");
		String s7 = new String("A");
		System.out.println(s6.compareTo(s7));// 32 => a-A => 97-65 => 32
		System.out.println(s6.compareToIgnoreCase(s7));// 0 => a-a => 97-97 => 0

		String s8 = "abcdef";
		String s9 = "abc";
		System.out.println(s8.compareTo(s9));// 3 =>s8.length()-s9.length() => 3

		String s10 = "abcdef";
		System.out.println(s9.compareTo(s10));// -3

		String s11 = "abc";
		System.out.println(s11.compareTo(s9));// 2 => d-b=>100-98=>2

		// startsWith() /endsWith()

		String ss = "Java Programming Language";
		System.out.println(ss.startsWith("Java"));// true
		System.out.println(ss.startsWith("java"));// false
		System.out.println(ss.startsWith("Hari"));// false

		System.out.println(ss.endsWith("Language"));// true
		System.out.println(ss.endsWith("Har"));// false

		// Print character of the given index, String index starts from zero, because
		// its internal object is char array, should use below method.
		// public char chatAt(int index)

		String ss1 = new String("Java Programming Lanugage");
		System.out.println("Character at 10th index in ss1 string:" + ss1.charAt(10));

		// Print all characters in given string with index, we should write our own
		// logic
		// with charAt() and length() method

		for (int i = 0; i < ss1.length(); i++) {
			System.out.println("Characters at index: " + i + " is " + ss1.charAt(i));
		}
	}
}
