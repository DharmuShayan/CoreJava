package com.privent;

public class ThreadYieldDemo {

	public static void main(String[] args) {

		YieldThreadDemo yd = new YieldThreadDemo();
		yd.start();

		for (int i = 0; i < 5; i++) {

			System.out.println("Main Thread");
		}

	}

}
