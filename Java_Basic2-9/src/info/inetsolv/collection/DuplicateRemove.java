package info.inetsolv.collection;


import java.util.Collections;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateRemove {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.addAll(Arrays.asList(10, 200, 30, 10, 10, 30, 70, 30));

		ArrayList duplist = new ArrayList(list);
		Iterator li = list.iterator();
		while (li.hasNext()) {
			Object object = (Object) li.next();
			if (Collections.frequency(list, object) > 1) {
				duplist.remove(object);

//System.out.println(list+":"+Collections.frequency(list, object));

			}

			System.out.println(duplist + ":");

		}

	}
}