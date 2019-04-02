package com.usingthreadclass;

public class MainClass {

	public static void main(String[] args) {

		Music m = new Music();
		m.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread...");
		}
	}
}
