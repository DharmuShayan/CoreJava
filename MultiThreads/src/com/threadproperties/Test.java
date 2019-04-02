package com.threadproperties;

public class Test {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		 MyThread t = new MyThread();
		 System.out.println(t.getName());
		 Thread.currentThread().setName("dharmu");
		 System.out.println(Thread.currentThread().getName());
		 System.out.println(Thread.currentThread().getId());
	}
}
