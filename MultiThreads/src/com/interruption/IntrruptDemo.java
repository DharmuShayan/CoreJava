package com.interruption;

public class IntrruptDemo {

	public static void main(String[] args) {
		
	 MyThread m = new  MyThread();
          m.start();
          m.interrupt();
         
			System.out.println("end of Main Thread");
		
	}

}
