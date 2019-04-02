package com.blueribbon.set;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;


public class TreeSetDemo1 {

	public static void main(String[] args) {

		TreeSet<Employee> set = new TreeSet<>(Comparator.comparing(e-> e.getFirstName()));
		     set.addAll(Arrays.asList(
		    			new Employee(6,"Yash", "Chopra", 25),
		    			new Employee(1,"Lokesh", "Gupta", 32),
		    		    new Employee(3,"Aakash", "Yaadav", 52),
		    		    new Employee(5,"David", "Kameron", 19),
		    		    new Employee(4,"James", "Hedge", 72),
		    		    new Employee(8,"Balaji", "Subbu", 88),
		    		    new Employee(7,"Karan", "Johar", 59),
		    		    new Employee(1,"Lokesh", "Gupta", 32)));
		     
		     Iterator<com.blueribbon.set.Employee> it = set.iterator();
		     while (it.hasNext()) {
				Employee e = (Employee) it.next();
				System.out.println(e);
			}
		     
	}

}
