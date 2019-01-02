package sort;

import java.util.Arrays;

public class SortStringArray {

	public static void main(String[] args) {

		/*
		 * Sort By java.util.Arrays sort()Sort method
		 */
		System.out.println("sort by Arrays class sort method");
		String[] arr1 = { "b", "a", "d", "c", "e" };
		Arrays.sort(arr1);
		for (String string : arr1) {
			System.out.print(string);
		}

		/*
		 * Sort By Bubble sort method
		 */
		System.out.println("\nsort by bubble sort method");
		String[] arr2 = { "b", "a", "d", "c", "e" };

		for (int j = 0; j < arr2.length; j++) {
			for (int i = 1; i < arr2.length - 1; i++) {

				if (arr2[i - 1].compareTo(arr2[i]) > 0) {
					String temp = arr2[i - 1];
					arr2[i - 1] = arr2[i];
					arr2[i] = temp;
				}
			}
		}

		for (String string : arr2) {
			System.out.print(string);
		}

	}

}
