package com.blueribbon.odd_even;

public class PrimeDemo1 {

	public static void main(String[] args) {

		for (int i = 2; i <= 100; i++) {

			for (int j = 2; j <= i; j++) {

				if (i % 2 == 0 ) {
					break;
				}
				if (j == i) {
					System.out.println("Number is Prime:" + i);
				}
			}
		}

	}

}
