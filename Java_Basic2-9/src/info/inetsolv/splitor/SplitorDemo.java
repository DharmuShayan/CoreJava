package info.inetsolv.splitor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;


public class SplitorDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>( Arrays.asList(100,20,30,40,50,80,90));
		Collections.sort(list);
		Iterator<Integer> i=list.iterator();
		
	while(i.hasNext()) {
		System.out.println(i.next());
		
	}
	
	}

}
