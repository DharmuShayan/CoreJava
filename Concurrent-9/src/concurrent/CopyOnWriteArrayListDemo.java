package concurrent;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {

	public static void main(String[] args) {

		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
		list.add("A");
		list.add("A");
		list.addIfAbsent("B");
		list.addIfAbsent("B");

		System.out.println(list);

	}

}
