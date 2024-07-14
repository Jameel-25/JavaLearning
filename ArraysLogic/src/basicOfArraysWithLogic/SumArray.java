package basicOfArraysWithLogic;

public class SumArray {

	public static void main(String[] args) {
		int[] numbers = { 8, 3, 2, 1, 9 };
		int sum = 0;

		for (int num : numbers) {
			sum += num;
		}
		System.out.println("The sum of all elements is: " + sum);

	}

}
