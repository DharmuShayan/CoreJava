package reentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo3 {

	public static void main(String[] args) {
	

		MyThread2 t1 = new MyThread2("1st Thread");
		MyThread2 t2 = new MyThread2("2nd Thread");
		t1.start();
		t2.start();

	}

}

class MyThread2 extends Thread {
	static ReentrantLock l = new ReentrantLock();

	MyThread2(String name) {
		super(name);
	}

	@Override
	public void run() {
		if (l.tryLock()) {
			System.out.println(Thread.currentThread().getName() +":"+ "got lock and performing..");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
			}
			l.unlock();

		} else {
			System.out.println(Thread.currentThread().getName() +":"+ "got lock and performing..");
		}

	}
}
