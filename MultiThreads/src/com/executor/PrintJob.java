package com.executor;


public class PrintJob implements Runnable{
	
	String name;
	public PrintJob(String name) {
		this.name=name;
	}
	
	public void run() {
		System.out.println(name+" --Started by Thread"+Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(name+" --Complited by Thread"+Thread.currentThread().getName());
	}
	
}
