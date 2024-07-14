package basicOfArraysWithLogic;

public class CheckSorted {

	public static void main(String[] args) {
		int[] numbers = { 3, 5, 7, 2, 8 }; // 3,5,7,2,8
		boolean isSorted = true;

		for (int i = 0; i < numbers.length - 1; i++) {
			if (numbers[i] > numbers[i + 1]) {
				isSorted = false;
				break;
			}
		}
		if (isSorted) {
			System.out.println("The array is sorted in ascending order");
		} else {
			System.out.println("The array is not sorted in ascending order");
		}

	}

}
