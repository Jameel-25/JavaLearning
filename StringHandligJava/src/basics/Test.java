package basics;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter String: ");
		
		String str = s.nextLine();
		String result = StringWordsReverse.reverseStringWords(str);

		System.out.println("Original String: " + str);
		System.out.println("Reverse String: " + result);
	}
}
