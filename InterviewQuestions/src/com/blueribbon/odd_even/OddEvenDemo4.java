package com.blueribbon.odd_even;

public class OddEvenDemo4 {

	public static void main(String[] args) {

		for (int i = 2; i <= 100; i++) {

			for (int j = 2; j <= i; j++) {

				if (j == i) {
					System.out.println("Number is Prime:" + i);
				}

				if (i % 2 == 0) {
					break;
				}

			}
		}

	}

}
