package com.privent;

public class ThreadJoinDemo {

	public static void main(String[] args) throws InterruptedException {

		
		JoinThreadDemo jt = new JoinThreadDemo();
		jt.start();
		jt.join();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread");
		}
		
		
	}

}
