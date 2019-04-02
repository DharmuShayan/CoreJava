package info.inetsolv.collection;

import java.util.*;
import java.lang.*;

@SuppressWarnings("unused")
public class TreeSetDemoo {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		TreeSet set = new TreeSet(new MyComparator());

		set.add("u1");
		set.add("z");
		set.add("c");
		set.add("r");
		set.add("t");
		set.add("v");

		System.out.println(set);

	}
}