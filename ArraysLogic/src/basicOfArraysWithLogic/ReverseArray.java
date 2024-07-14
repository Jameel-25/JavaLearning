package basicOfArraysWithLogic;

public class ReverseArray {

	public static void main(String[] args) {

		int[] numbers = { 1, 4, 2, 9, 6 };
		int[] reverse = new int[numbers.length];

		for (int i = 0; i < numbers.length; i++) {
			reverse[i] = numbers[numbers.length - 1 - i]; // 5-1-0, 4th positioned will updated
		}
		System.out.print("Reverse Array: ");

		for (int num : reverse) {
			System.out.print(num+" ");
		}

	}

}
