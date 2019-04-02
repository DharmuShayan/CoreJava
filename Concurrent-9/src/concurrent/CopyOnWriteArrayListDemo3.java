package concurrent;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo3 {

	public static void main(String[] args) {

		ArrayList<String> l1 = new ArrayList<>();
		l1.add("A");
		l1.add("B");

		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
		list.addIfAbsent("A");
		list.addIfAbsent("C");
		
		System.out.println(list);//[A, C]
		list.addAll(l1);
		
		
		System.out.println(list);//[A, C, A, B]

		ArrayList<String> l2 = new ArrayList<>();
		l2.add("A");
		l2.add("E");

		list.addAllAbsent(l2);
		
		System.out.println(list);//[A, C, A, B, E]

	}

}
