package com.mixedapproach;

public class Test {

	public static void main(String[] args) {
		
		MyThread mt = new MyThread();
		Thread t = new Thread(mt);
         t.start();
         for (int i = 0; i < 5; i++) {
			System.out.println("Main thread");
		}
	}

}
