package comparatorWithLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EmployeeSortingWithLambda {

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
		
		System.out.println("Sort by first name");
		//emp.sort(Comparator.comparing(e -> e.getFirstName()));
		System.out.println("----------");
		emp.sort(Comparator.comparing(Employee::getFirstName));
		 System.out.println(emp);

		 
		System.out.println("Sort by last name");
		emp.sort(Comparator.comparing(e -> e.getLastName()));
			
		emp.sort(Comparator.comparing(Employee::getLastName));
		System.out.println(emp);
	}

}
