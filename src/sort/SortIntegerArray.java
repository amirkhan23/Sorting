package sort;

import java.util.Arrays;

public class SortIntegerArray {

	public static void main(String[] args) {

		/*
		 * Sort By java.util.Arrays sort()Sort method
		 */
		int[] array1 = { 2, 8, 1, 4, 3, 7, 9, 5, 6 };
		Arrays.sort(array1);
		System.out.println("sort by Arrays class sort method");
		for (Integer a : array1) {
			System.out.print(a);
		}

		/*
		 * Sort By Bubble sort method
		 */

		int[] array2 = { 2, 8, 1, 4, 3, 7, 9, 5, 6 };
		for (int j = 0; j < array2.length; j++) {
			for (int i = 1; i < array2.length - 1; i++) {

				if (array2[i - 1] > array2[i]) {
					int temp = array2[i - 1];
					array2[i - 1] = array2[i];
					array2[i] = temp;
				}
			}
		}

		System.out.println("\nsort by bubble sort method");
		for (Integer a : array2) {
			System.out.print(a);
		}

	}

}
