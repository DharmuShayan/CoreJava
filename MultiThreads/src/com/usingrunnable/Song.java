package com.usingrunnable;



public class Song  {

	public static void main(String[] args) {

		Thread th = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 3; i++) {
					System.out.println("Songs thread");
				}
				
			}});
		
		th.start();
	}

}
