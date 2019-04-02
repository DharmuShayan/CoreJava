package com.interruption;

public class MyThread extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Leazy Thread");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("I got Interrupted");
				
			}
		}
	}
}
