package com.threadgroup;

public class ThreadGroupDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		/*System.out.println(Thread.currentThread().getThreadGroup().activeCount());
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent());
		System.out.println(Thread.currentThread().getThreadGroup().activeGroupCount());*/
	
		ThreadGroup tg = new ThreadGroup("tg");
	    
	    Thread fi = new Thread(tg,"MyThread1");
	    Thread  se= new Thread(tg,"MyThread2");
	    
	    System.out.println(fi);
	
	}

}
