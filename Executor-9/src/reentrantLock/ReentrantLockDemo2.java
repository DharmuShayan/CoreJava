package reentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo2 {

	public static void main(String[] args) {
		Display d = new Display();

		
        MyThread1 t1=new MyThread1(d, "Dhoni");
        MyThread1 t2=new MyThread1(d, "Kohli");
        MyThread1 t3=new MyThread1(d, "Rohit");
        t1.start();
        t2.start();
        t3.start();
      
	}

}

class MyThread1 extends Thread{
	Display d;
	String name;
	MyThread1(Display d,String name){
		this.d=d;
		this.name=name;
	}
	
	@Override
	public void run() {
		d.wish(name);
	}
	
}


class Display{
	
	ReentrantLock l = new ReentrantLock();
	public  void wish(String name) {
		l.lock();
		for (int i = 0; i < 5; i++) {
			System.out.print("GoodMorning:");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {}
			System.out.println(name);
		}
	       l.unlock();
	}
}

