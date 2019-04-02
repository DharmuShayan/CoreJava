package concurrent;


import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo4 extends Thread {
	
	static CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
	
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {

		}
		System.out.println("Child thread updating map");
		list.add("C");
	}

	public static void main(String[] args) throws InterruptedException {

		list.add("A");
		list.add("B");
		
		CopyOnWriteArrayListDemo4 t = new CopyOnWriteArrayListDemo4();
		t.start();
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println("Main Thread iterating map and current entry is:" + s);
			Thread.sleep(3000);
		}

    System.out.println(list);
	}

}
