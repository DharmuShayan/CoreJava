
package info.inetsolv.collection;

import java.util.*;
import java.util.Map.*;

@SuppressWarnings("unused")
public class TreeMapDemo {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		TreeMap map = new TreeMap(new MyComparator());

		map.put("10", "Tom");
		map.put("50", "Null");
		map.put("men", "Sam");
		map.put("5", "Tom");

		System.out.println(map);
	}

}
