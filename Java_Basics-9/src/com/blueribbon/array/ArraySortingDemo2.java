package com.blueribbon.array;

public class ArraySortingDemo2 {
	public static void main(String args[]) {

		int arr[] = { 67, 2, 5, 45, 3, 4, 6, 1,-89 };
		sortingArray(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	private static void sortingArray(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[index]) {
					index = j;
				}
			}

			int smallerNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallerNumber;
		}
	}
}