package com.priority;

public class Test {

	public static void main(String[] args) {

		MusicThread m = new MusicThread();
		
		MovieThread mo = new MovieThread();
		
		mo.setPriority(8);
		m.setPriority(5);
		mo.start();
		m.start();

	}

}
