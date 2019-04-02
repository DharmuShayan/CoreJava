package concurrent;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo2 extends Thread {

	static ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {

		}
		System.out.println("Child thread updating map");
		map.put(103, "C");
	}

	public static void main(String[] args) throws InterruptedException {
		map.put(101, "A");
		map.put(102, "B");

		ConcurrentHashMapDemo2 t = new ConcurrentHashMapDemo2();
		t.start();
		Set<Integer> set = map.keySet();
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			Integer s = (Integer) it.next();
			System.out.println("Main Thread iterating map and current entry is:" + s + "::" + map.get(s));
			Thread.sleep(3000);
		}

		System.out.println(map);
	}

}
