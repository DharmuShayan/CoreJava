package com.privent;

public class YieldThreadDemo extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {

			//Thread.yield();
			System.out.println("Child Thread");

		}
	}

}
