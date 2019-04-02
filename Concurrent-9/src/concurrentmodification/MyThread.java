package concurrentmodification;

import java.util.ArrayList;
import java.util.Iterator;

public class MyThread extends Thread {

	static ArrayList<String> list = new ArrayList<>();

	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
			
		}
		System.out.println("Child thread updating list");
		list.add("h");
	}
	
	public static void main(String[] args)throws InterruptedException {
		list.add("A");
		list.add("B");
		list.add("C");
		
		MyThread t = new MyThread();
		t.start();
		Iterator<String> it=list.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println("Main Thread iterating list and current thread adding object"+s);
			Thread.sleep(3000);
		}
		
		System.out.println(list);
	}

}
