package reentrantLock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo4 {

	public static void main(String[] args) {
	

		MyThread3 t1 = new MyThread3("1st Thread");
		MyThread3 t2 = new MyThread3("2nd Thread");
		t1.start();
		t2.start();

	}

}

class MyThread3 extends Thread {
	static ReentrantLock l = new ReentrantLock();

	MyThread3(String name) {
		super(name);
	}

	@Override
	public void run() {
		do {
			try {
		if (l.tryLock(500,TimeUnit.MICROSECONDS)) {
			System.out.println(Thread.currentThread().getName() +":"+ "got lock..");
			
				Thread.sleep(3000);
				l.unlock();
				System.out.println(Thread.currentThread().getName() +":"+ "Release..");
				break;
			} 
		else {
			System.out.println(Thread.currentThread().getName() +":"+ "Unable to get lock and will try again");
		}
			}
			catch(Exception e){}
				
		}
		while(true);

	}
	}
		
	