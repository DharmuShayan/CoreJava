package com.executor;

import java.util.concurrent.ExecutionException;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ExecutorDemoWithRunnable {
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		PrintJob[] job = { new PrintJob("A"), 
				new PrintJob("B"), 
				new PrintJob("C"), 
				new PrintJob("D"),
				new PrintJob("E"), 
				new PrintJob("F"), 
				new PrintJob("G"), };

//		Executor service1 = Executors.newFixedThreadPool(7);
//		for (PrintJob printJob : job) {
//			service1.execute(printJob);
//		}

		ExecutorService service = Executors.newFixedThreadPool(7);
		for (PrintJob printJob : job) {
			service.submit(printJob);
		}
		service.shutdown();
	}
}