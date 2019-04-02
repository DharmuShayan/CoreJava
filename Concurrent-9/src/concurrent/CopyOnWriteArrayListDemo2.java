package concurrent;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo2 {

	public static void main(String[] args) {

		ArrayList<String> l1 = new ArrayList<>();
		l1.add("A");
		l1.add("B");

		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
		list.add("A");
		list.add("C");
		System.out.println(list);//[A, C]
		list.addAll(l1);
		System.out.println(list);//[A, C, A, B]

		ArrayList<String> l2 = new ArrayList<>();
		l2.add("A");
		l2.add("D");

		list.addAllAbsent(l2);
		
		System.out.println(list);//[A, C, A, B, D]

	}

}
