package concurrent;


import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo6 extends Thread {

	public static void main(String[] args) throws InterruptedException {
		
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		
		Iterator<String> it = list.iterator();
		list.add("D");
		while (it.hasNext()) {
			String string = (String) it.next();
			System.out.println(string);
			
		}
		
	}

}
