package com.blueribbon.a;

import java.util.*;

class CollectorsDemo {
	@SuppressWarnings("unused")
	public static void main(String... kkk) {

		List<Integer> li = new ArrayList<>();
		for (int i = 1; i < 50; i += 2)
			li.add(i);

		System.out.println(li.toString());
		int a = 10;
		int b = 0;
		try {
			int z = a / b;
		} catch (Exception cause) {
			StackTraceElement elements[] = cause.getStackTrace();
			for (int i = 0, n = elements.length; i < n; i++) {
				System.err.println(elements[i].getFileName() + ":" + elements[i].getLineNumber() + ">> "
						+ elements[i].getMethodName() + "()");
			}
		}

	}
}