package com.wrapper;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Demo {
	
	private static void printConditionally(List<Student> list,Predicate<Student> predicate) {
		
		for (Student student : list) {
			if (predicate.test(student)) {
				System.out.println(student);
			}
		}
	}

	public static void main(String[] args) {
		
         List<Student> list = Arrays.asList(
        		 new Student(1,"SHAYAN",300),
        		 new Student(4,"DHARMU",330),
        		 new Student(55,"ROBIN",360),
        		 new Student(23,"AARYAN",3020),
        		 new Student(78,"AAYAT",3009)
        		 );
         
         Collections.sort(list, (s1,s2)->s1.getMarks().compareTo(s2.getMarks()));
         list.forEach(System.out::println);
         
         System.out.println("ALl Student");
         printConditionally(list, e->true);
         
         System.out.println("ALl Student whose name start with A");
         //printConditionally(list,e->e.getName().startsWith("A"));
	}

}
