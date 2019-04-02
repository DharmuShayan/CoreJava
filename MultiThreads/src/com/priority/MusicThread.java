package com.priority;

public class MusicThread extends Thread {

	public void run() {
		for (int i = 0; i <5; i++) {
			System.out.println("Music"+i);
		}
	}
}
