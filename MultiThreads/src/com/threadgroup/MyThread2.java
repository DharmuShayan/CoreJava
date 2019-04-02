package com.threadgroup;

public class MyThread2 extends Thread {

	public MyThread2(ThreadGroup pg, String string) {

	}

	@Override
	public void run() {
		System.out.println("MyThread2");
	}
}
