package info.inetsolv.collection;

import java.util.*;
import java.lang.*;

@SuppressWarnings({ "rawtypes", "unused" })
public class MyComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		String s1 = (String) o1;
		String s2 = (String) o2;
		
		
		if (s1.equals(s2)) {
			return 0;
		}else {
			return 100;
		}
		//return s1.compareTo(s2);
	}
}