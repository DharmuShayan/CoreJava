package com.blueribbon.array;

public class ArraySortingDemo {
	public static void main(String args[]) {

		int[] a = { 67, 2, 5, 45, 3, 4, 6, 1,-89,-1 };
		sortingArray(a);
		
	}
	
	private static void sortingArray(int[] a) {

		for (int i = 0; i < a.length ; i++) {
			for (int j = 0; j < a.length-1 ; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
				}
			}
			
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println("array is" + a[i]);

		}

	}
}