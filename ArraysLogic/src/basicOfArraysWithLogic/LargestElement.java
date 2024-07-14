package basicOfArraysWithLogic;

public class LargestElement {

	public static void main(String[] args) {

		int[] numbers = { 2, 3, 5,10, 6,1, 9, 4, 7 };
		int max = numbers[0];// Assuming the first element if largest

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		System.out.println("The larges element is: " + max);

	}

}
