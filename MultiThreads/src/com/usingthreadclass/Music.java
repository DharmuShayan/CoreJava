package com.usingthreadclass;

public class Music extends Thread {
	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {
			System.out.println("Song is playing...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
