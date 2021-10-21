package javaTrickyScenario;

import java.util.Arrays;

public class ShiftZeroToRight {

	private static int[] shiftZeroToRight(int[] a) {
		if (a.length == 1) {
			return a;
		}
		int newArray[] = new int[a.length];
		int count = 0;
		for (int number : a) {
			if (number != 0) {
				newArray[count] = number;
				count++;
			}
		}
		return newArray;
	}

	public static void main(String[] args) {
		int[] i = new int[] { 1, 0, 2, 0, 3, 0, 4, 0, 5, 0, 6, 0, 7, 0, 8, 0, 9, 0 };
		System.out.println(Arrays.toString(shiftZeroToRight(i)));

		i = new int[] { 0, 1, 0, 2, 0, 3, 0, 4, 0, 5, 0, 6, 0, 7, 0, 8, 0, 9, 0 };
		System.out.println(Arrays.toString(shiftZeroToRight(i)));

		i = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		System.out.println(Arrays.toString(shiftZeroToRight(i)));

		i = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(Arrays.toString(shiftZeroToRight(i)));
		
		i = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		System.out.println(Arrays.toString(shiftZeroToRight(i)));
		
		i = new int[] {0};
		System.out.println(Arrays.toString(shiftZeroToRight(i)));
		
		i = new int[] {1};
		System.out.println(Arrays.toString(shiftZeroToRight(i)));

	}

}
