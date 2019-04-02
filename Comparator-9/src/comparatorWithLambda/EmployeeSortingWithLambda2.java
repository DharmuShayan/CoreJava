package comparatorWithLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import java.util.List;


public class EmployeeSortingWithLambda2 {

	public static void main(String[] args) {

		List<Employee> emp = new ArrayList<Employee>(Arrays.asList(
		new Employee(6,"Yash", "Chopra", 25),
	    new Employee(2,"Aman", "Sharma", 28),
	    new Employee(3,"Aakash", "Yaadav", 52),
	    new Employee(5,"David", "Kameron", 19),
	    new Employee(4,"James", "Hedge", 72),
	    new Employee(8,"Balaji", "Subbu", 88),
	    new Employee(7,"Karan", "Johar", 59),
	    new Employee(1,"Lokesh", "Gupta", 32),
	    new Employee(9,"Vishu", "Bissi", 33),
	    new Employee(10,"Lokesh", "Ramachandran", 60)	
				));
		
		System.out.println("Sort by reversed name");
		Comparator<Employee> com = Comparator.comparing(e -> e.getFirstName());
		 emp.sort(com.reversed());
		 System.out.println(emp);
		
		
		
		 
	}

}
