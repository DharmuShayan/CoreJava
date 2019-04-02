package info.inetsolv.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

@SuppressWarnings("unused")
public class ArrayListDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
	
		
		List list=new ArrayList();
		/*list.addAll(Arrays.asList(10,200,30,10,10,30,70,30));
		
		
		
		HashSet set =new HashSet(list);
		Iterator li=list.iterator();
		while (li.hasNext()) {
			Object object = (Object) li.next();
			System.out.println(set+":"+Collections.frequency(set, object));
		}
			*/
		
		
		/*ListIterator li=list.listIterator();
		li.add("");
		
		while(li.hasNext()) {
			Object o=li.next();
			
			System.out.println(o);
		
		}*/
		
	Vector v=new Vector(list);
	v.addAll(Arrays.asList(10,50,78,86));
	System.out.println(v.capacity());
		
		     list.forEach(System.out::println);
			   
			 
			   }
	}


