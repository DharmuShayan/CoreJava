package concurrent;


import java.util.Iterator;

import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetDemo  {

	public static void main(String[] args) throws InterruptedException {
		
		CopyOnWriteArraySet<String> list = new CopyOnWriteArraySet<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		System.out.println(list);
		
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String string = (String) it.next();
			if (string.equals("D")) {
				it.remove();
			}
			
		}
		System.out.println(list);//java.lang.UnsupportedOperationException
	}

}
