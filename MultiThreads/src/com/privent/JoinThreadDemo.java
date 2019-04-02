package com.privent;

public class JoinThreadDemo extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Child Thread");
			try {
				Thread.sleep(10000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
	}
}
