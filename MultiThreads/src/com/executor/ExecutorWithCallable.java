package com.executor;


import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorWithCallable{
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		MyCallable[] jobs= {
				new MyCallable(10),
				new MyCallable(20),
				new MyCallable(30),
				new MyCallable(40),
				new MyCallable(50),
				new MyCallable(60)
		};
		
		
		ExecutorService service=Executors.newFixedThreadPool(6);
		for (MyCallable myCallable : jobs) {
			Future<Object> in = service.submit(()->{
				System.out.println(Thread.currentThread().getName() + "is responsible to find sum of first --" + myCallable.num + "numbers");
				int sum=0;
				for (int i = 0; i <= myCallable.num; i++) {
					sum+=i;
				}
				return sum;
				
			});
			System.out.println(in.get());
		}
		
	}

}


class MyCallable  {

	int num;
    MyCallable(int num) {
		this.num=num;
	}
	
//	public Object call() {
//		System.out.println(Thread.currentThread().getName() + "is responsible to find sum of first --" + num + "numbers");
//		int sum=0;
//		for (int i = 0; i <=num; i++) {
//			sum+=i;
//		}
//		return sum;
//		
//	}
	
}
