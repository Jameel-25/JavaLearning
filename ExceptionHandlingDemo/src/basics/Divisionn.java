package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Divisionn {
	public static void div() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int a = -1;
			int b = -1;
			// Infinite loop to prompt message till user enter number
			while (true) {
				try {
					System.out.print("Enter first number: ");
					a = Integer.parseInt(br.readLine());
					break;
				} catch (NumberFormatException nfe) {
					System.out.println("Wrong input: Enter only number");
				}
			}
			// Infinite loop to prompt message till user enter number
			while (true) {
				try {
					System.out.print("Enter second number:");
					b = Integer.parseInt(br.readLine());
					try {
						int c = a / b;
						System.out.println("Result: " + c);
					} catch (ArithmeticException ae) {
						System.out.println("Wrong input: Do ot pass zero");
						continue;
					}
					break;
				} catch (NumberFormatException nfe) {
					System.out.println("Wrong input: Enter only number");

				}
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}