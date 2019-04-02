package com.blueribbon.interfaces;

public  interface OperateCar {
	
	
	public static final int value=10;
	
	 static void setMethod() {
		
	}

	 default int setMethodA() {
		return 0; 
	 }
	 
	 public abstract int runMethod();
	 
	 
}
