package com.threadgroup;

public class MyThread1 extends Thread {

	public MyThread1(ThreadGroup pg, String name) {
		
	}

	@Override
	public void run() {
		System.out.println("MyThread1");
	}
}
