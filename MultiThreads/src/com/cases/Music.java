package com.cases;

public class Music extends Thread {
	
	public void run() {
		System.out.println("no-argument run()");
	}

	public void run(int i) {
		System.out.println("argument run()");
	}
}
